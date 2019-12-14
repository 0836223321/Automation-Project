package com.ekurhuleni.DemsPages.Actions;

import Base.Page;
import com.ekurhuleni.DemsPages.Locators.DemsLoginLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DemsLoginPage extends Page {
    public DemsLoginLocators demsLoginLocators;

    public DemsLoginPage() {

        this.demsLoginLocators = new DemsLoginLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.demsLoginLocators);
    }

    public void setDemsLoginLocators(String userName, String passWord) throws InterruptedException {

        WebElement wb = driver.findElement(By.id("tbUserName"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='suresh';", wb);
        jse.executeScript("document.getElementById('tbPassword').value='Password@1';");

        WebElement loginBtn = driver.findElement(By.id("btnLogon_ClientState"));
        JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
        loginbtn.executeScript("arguments[0].click();", loginBtn);

        /*demsLoginLocators.username.sendKeys(userName);
        Thread.sleep(5000);
        demsLoginLocators.password.sendKeys(passWord);
        demsLoginLocators.password.sendKeys(passWord);
        demsLoginLocators.login_Button.click();
    }*/
    }
}
