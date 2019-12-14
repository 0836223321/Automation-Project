package com.ekurhuleni.DemsPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemsLoginLocators {
    @FindBy(how= How.ID, using = "tbUserName")
    public WebElement username;

    @FindBy(how = How.ID,using = "tbPassword")
    public WebElement password;

    @FindBy(how = How.ID, using = "btnLogon_ClientState")
    public WebElement login_Button;

}
