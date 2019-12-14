package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TestUtil {
    static WebDriver driver;
    public static String screenshotPath;
       public static void captureScreenshot() throws IOException {
         File scrFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE );
         FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir" + "src\\main\\Screenshots")));


       }
}
