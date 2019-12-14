package Base;

import Utilities.ReadExcelData;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Page {

    public static WebDriver driver;
    public static Logger log = Logger.getLogger("devpinoyLogger");
    public static ReadExcelData excel = new ReadExcelData(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestData\\Fleet Data.xlsx");


    public static void initConfiguration() {

        if(Constants.browser.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\executables\\chromedriver.exe");
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            prefs.put("credentials_enable_service", false);
            prefs.put("profile password_manager_enabled", false);

            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--daible-extentions");
            options.addArguments("--diable-infobars");
            driver = new ChromeDriver(options);
            driver = new ChromeDriver();

        }
        else if(Constants.browser.equals("ie")){
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\executables\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else if(Constants.browser.equals("Firefox")){

            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\executables\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(Constants.fleetUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
    }

    public static void quitBrowser() {
        driver.quit();

    }

}