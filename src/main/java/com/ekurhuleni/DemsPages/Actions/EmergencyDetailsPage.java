package com.ekurhuleni.DemsPages.Actions;

import Base.Page;
import com.ekurhuleni.DemsPages.Locators.EmergencyDetailsLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class EmergencyDetailsPage extends Page {
    public EmergencyDetailsLocators emergencyDetailsLocators;
    public EmergencyDetailsPage(){

        this.emergencyDetailsLocators = new EmergencyDetailsLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.emergencyDetailsLocators);
    }

    public void callerDetailsScreen(String caller_Name, String callerCell, String comments_TextArea) throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"ctl00_RadMenu1\"]/ul/li[11]/a/span"));
        JavascriptExecutor calls = (JavascriptExecutor)driver;
        calls.executeScript("arguments[0].click();",element);

        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_RadToolBar1\"]/div/div/div/ul/li[7]/a/span/span/span/span"));
        JavascriptExecutor newCall = (JavascriptExecutor)driver;
        newCall.executeScript("arguments[0].click();",element1);

      /*  List <WebElement> isPresent = driver.findElements(By.id("ctl00_MainContent_btnYes_ClientState"));

        if(isPresent.size()!= 0){

            // continue from where you left off, Capture Caller Details
            //capture name and cell number the continue from location
        }
        else{

            driver.findElement(By.id("ctl00_MainContent_BtnNo_ClientState")).click();*/

            //start capturing from scratch
            //driver.findElement(By.id("tbcallname")).sendKeys("Thandeka");
            emergencyDetailsLocators.callerName.sendKeys(caller_Name);

            //driver.findElement(By.id("tbcalltel")).sendKeys("0823889921");
            emergencyDetailsLocators.callerNumber.sendKeys(callerCell);

            /*Categories*/

            driver.findElement(By.name("DropCategory")).click();
            WebElement element2 = driver.findElement(By.xpath("//*[@id=\"DropCategory_DropDown\"]/div/ul/li[8]"));
            JavascriptExecutor category = (JavascriptExecutor)driver;
            category.executeScript("arguments[0].click();",element2);

            driver.findElement(By.name("DropSubCat")).click();
            WebElement element3 = driver.findElement(By.xpath("//*[@id=\"DropSubCat_DropDown\"]/div/ul/li[5]"));
            JavascriptExecutor subCatargory = (JavascriptExecutor)driver;
            subCatargory.executeScript("arguments[0].click();",element3);

            emergencyDetailsLocators.commentsTextArea.sendKeys(comments_TextArea);

        }

    public void locationScreen(String street_Search) throws InterruptedException {

        emergencyDetailsLocators.locationTab.click();
        emergencyDetailsLocators.streetSearch.sendKeys(street_Search);
        emergencyDetailsLocators.selectStreetName.click();
        //emergencyDetailsLocators.routeNumber.click();
        Thread.sleep(5000);
        //emergencyDetailsLocators.selectRoute.click();
        emergencyDetailsLocators.region.click();
        emergencyDetailsLocators.regionName.click();
    }

    public void dispatchScreen(String callerAddress, String statementTextArea){

        emergencyDetailsLocators.dispatchTab.click();
        emergencyDetailsLocators.callerAddress.sendKeys(callerAddress);
        emergencyDetailsLocators.statementBox.sendKeys(statementTextArea);
        emergencyDetailsLocators.priorityButton.click();
        emergencyDetailsLocators.priorityType.click();
        //emergencyDetailsLocators.methodOfCall.click();
        //emergencyDetailsLocators.methodType.click();
        emergencyDetailsLocators.dispatchSaveButton.click();

        emergencyDetailsLocators.otherServicesButton.click();
        emergencyDetailsLocators.DCC_checkbox.click();
        emergencyDetailsLocators.EMPD_checkbox.click();
    }
}
