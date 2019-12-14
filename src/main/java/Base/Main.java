package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
   public static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {

        //System.setProperty("webdriver.ie.driver", "C:\\Users\\Thandeka\\Desktop\\IEDriverServer.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thandeka\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("http://10.1.2.239/ESS2calls/rm/default.aspx");
        Thread.sleep(10000);
        driver.manage().window().maximize();



        WebElement wb = driver.findElement(By.id("tbUserName"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='suresh';", wb);
        jse.executeScript("document.getElementById('tbPassword').value='Password@1';");

        WebElement loginBtn = driver.findElement(By.id("btnLogon_ClientState"));
        JavascriptExecutor loginbtn = (JavascriptExecutor)driver;
        loginbtn.executeScript("arguments[0].click();",loginBtn);
        //driver.quit();


        WebElement element = driver.findElement(By.xpath("//*[@id=\"ctl00_RadMenu1\"]/ul/li[11]/a/span"));
        JavascriptExecutor calls = (JavascriptExecutor)driver;
        calls.executeScript("arguments[0].click();",element);

        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_RadToolBar1\"]/div/div/div/ul/li[7]/a/span/span/span/span"));
        JavascriptExecutor newCall = (JavascriptExecutor)driver;
        newCall.executeScript("arguments[0].click();",element1);

        //after clicking new call, a yes and no screen pop up, use an if statement

        /*//write an if statement for this screen
        driver.findElement(By.id("ctl00_MainContent_BtnNo_ClientState")).click();

        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_RadToolBar1\"]/div/div/div/ul/li[7]/a/span/span/span/span"));
        JavascriptExecutor yes = (JavascriptExecutor)driver;
        yes.executeScript("arguments[0].click();",element4);*/

        driver.findElement(By.id("tbcallname")).sendKeys("Thandeka");
        driver.findElement(By.id("tbcalltel")).sendKeys("0823889921");
        driver.findElement(By.name("DropCategory")).click();

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"DropCategory_DropDown\"]/div/ul/li[8]"));
        JavascriptExecutor catagory = (JavascriptExecutor)driver;
        catagory.executeScript("arguments[0].click();",element2);

        driver.findElement(By.name("DropSubCat")).click();
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"DropSubCat_DropDown\"]/div/ul/li[5]"));
        JavascriptExecutor subCa = (JavascriptExecutor)driver;
        subCa.executeScript("arguments[0].click();",element3);

        WebElement elementLocation = driver.findElement(By.xpath("//*[@id=\"DropSubCat_DropDown\"]/div/ul/li[5]"));
        JavascriptExecutor locationTab = (JavascriptExecutor)driver;
        locationTab.executeScript("arguments[0].click();",elementLocation);









    }













    }


