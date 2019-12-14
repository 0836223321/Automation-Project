package Base;

import Utilities.ReadExcelData;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class NewTestBase {

    /*
     * WedDriver - done
     * Properties
     * Logs
     * Extent Reports
     * DataBase
     * Excel - done
     * Mail
     * */
    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties ObjectRepo = new Properties();
    public static FileInputStream fis;
    public static Logger log = Logger.getLogger("devpinoyLogger");
    public static ReadExcelData excel = new ReadExcelData(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestData\\Fleet Data.xlsx");

    @BeforeSuite
    public void setUp() throws IOException {

        if (driver == null) {

            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Config\\NewConfig.properties");
            config.load(fis);
            log.debug("Config File Loaded");

            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Config\\RepoObject.properties");
            ObjectRepo.load(fis);
            log.debug("Config File Loaded");
        }

        if (config.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\executables\\chromedriver.exe");
            driver = new ChromeDriver();
            log.debug("Chrome Launched");

        } else if (config.getProperty("browser").equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\executables\\geckodriver.exe");
            driver = new FirefoxDriver();
            log.debug("Firefox Launched");

        } else if (config.getProperty("browser").equals("ie")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\executables\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            log.debug("IE Launched");
        }

        driver.get(config.getProperty("url"));
        log.debug("Navigated to " +" "+config.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);

    }

    public boolean isElementPresent(By by){
        try {
            
            driver.findElement(by);
            return true;

        }catch (NoSuchElementException e){

            return  false;
        }
    }
    
    @AfterSuite
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

        log.debug("Test Execution Completed");

    }
}