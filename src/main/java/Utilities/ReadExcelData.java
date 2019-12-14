package Utilities;

import Base.NewTestBase;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData extends NewTestBase {

    public static WebDriver driver;
    public String path;
    public static HSSFWorkbook workbook;
    public static HSSFSheet worksheet;
    public static DataFormatter formatter= new DataFormatter();
    public FileInputStream fis = null;
    public static FileInputStream fileOut;
    static String SheetName= "Fleet";
    public String Res;
    WriteExcelData.Write object = new WriteExcelData.Write();
    public int DataSet=-1;

    public ReadExcelData(String path){

        this.path = path;
        try{
            fis = new FileInputStream(path);
            workbook = new HSSFWorkbook(fis);
            worksheet = workbook.getSheetAt(0);
            fis.close();

        }catch (Exception e){

            e.getStackTrace();
        }
    }

    @Test(dataProvider = "ReadDataOnFleetExcel")
    public void searchGoogle(String Search_Key){
            driver.findElement(By.xpath((ObjectRepo.getProperty("google_txtBox")))).sendKeys(Search_Key);

    }

    //Provides Data from Datasheet
    @DataProvider()
    public static Object[][] ReadDataOnFleetExcel() throws IOException
    {
        FileInputStream fileInputStream= new FileInputStream(String.valueOf((excel))); //Excel sheet file location get mentioned here
        workbook = new HSSFWorkbook (fileInputStream); //get my workbook
        worksheet = workbook.getSheet(SheetName);// get my sheet from workbook
        HSSFRow Row =worksheet.getRow(0);     //get my Row which start from 0

        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum = Row.getLastCellNum(); // get last ColNum

        Object Data[][] = new Object[RowNum-1][ColNum]; // pass my  count data in array

        for(int i=1; i<RowNum-1; i++) //Loop through the rows
        {
            HSSFRow row= worksheet.getRow(i+1);

            for (int j=0; j<ColNum; j++) //Loop work for colNum
            {
                if(row==null)
                    Data[i][j]= "";
                else
                {
                    HSSFCell cell= row.getCell(j);
                    if(cell==null)
                        Data[i][j]= ""; //if it get Null value it pass no data
                    else
                    {
                        String value=formatter.formatCellValue(cell);
                        Data[i][j]=value; //This object will cater for all the datatypes
                    }
                }
            }
        }

        return Data;
    }
}
