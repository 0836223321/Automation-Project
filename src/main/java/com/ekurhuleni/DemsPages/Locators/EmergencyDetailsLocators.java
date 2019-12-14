package com.ekurhuleni.DemsPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmergencyDetailsLocators {
    @FindBy(how = How.ID, using = "tbcallname")
    public WebElement callerName;

    @FindBy(how = How.ID, using = "tbcalltel")
    public WebElement callerNumber;

    @FindBy(how = How.ID, using = "DropCategory_Input")
    public WebElement catergory;
    @FindBy(how = How.XPATH, using = "//*[@id=\"DropCategory_DropDown\"]/div/ul/li[2]")
    public WebElement categoryType;

    @FindBy(how = How.NAME, using = "DropSubCat")
    public WebElement subCatergory;
    @FindBy(how = How.XPATH,using = "//*[@id=\"DropSubCat_DropDown\"]/div/ul/li[2]")
    public WebElement subCategoryType;

    @FindBy(how = How.ID, using = "TbComments")
    public WebElement commentsTextArea;

    //Call Termination Screen

    @FindBy(how = How.ID, using = "ctl00_MainContent_BtnNo_ClientState")
    public WebElement noButton;

    @FindBy(how = How.ID,using = "ctl00_MainContent_btnYes_ClientState")
    public WebElement yesButton;


    /*
     * Location Screen
     * */
    @FindBy(how = How.XPATH, using = "//*[@id=\"RadTabStripTop\"]/div/ul/li[2]/a/span/span/span")
    public WebElement locationTab;

    @FindBy(how = How.ID, using = "RadComboSearchStreet1_Input")
    public WebElement streetSearch;


    @FindBy(how = How.XPATH, using = "//*[@id=\"RadComboSearchStreet1_DropDown\"]/div/ul/li[3]")
    public WebElement selectStreetName;

    @FindBy(how = How.ID, using = "tbXroad2")
    public WebElement otherCrossroad;

    @FindBy(how = How.ID, using = "TbLocation")
    public WebElement locationName;

    @FindBy(how = How.ID, using = "TbFloor")
    public WebElement floor_Room;

    @FindBy(how = How.ID, using = "TbComplex")
    public WebElement complex;

    @FindBy(how = How.ID, using = "TbPOI")
    public WebElement unlabelledTextBox;

    @FindBy(how = How.ID, using = "tbLocNUm")
    public WebElement locationNumber;

    @FindBy(how = How.ID, using = "DropRoute_Input")
    public WebElement routeNumber;

    @FindBy(how = How.XPATH, using = "//*[@id=\"DropRoute_DropDown\"]/div/ul/li[2]")
    public WebElement selectRoute;

    @FindBy(how = How.ID, using = "DropStation_Input")
    public WebElement region;
    @FindBy(how = How.XPATH,using = "//*[@id=\"DropStation_DropDown\"]/div/ul/li[3]")
    public WebElement regionName;

    /*
    * Dispatch Screen
    * */
    @FindBy(how = How.XPATH, using = "//*[@id=\"RadTabStripTop\"]/div/ul/li[3]/a/span/span/span")
    public WebElement dispatchTab;

    @FindBy(how = How.ID,using = "tbcalladdr")
    public WebElement callerAddress;

    @FindBy(how = How.ID,using = "TbStatement")
    public WebElement statementBox;

    @FindBy(how = How.ID, using = "DropPriority_Input")
    public WebElement priorityButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"DropPriority_DropDown\"]/div/ul/li[2]/ul")
    public WebElement priorityType;

    @FindBy(how = How.ID,using = "DropMethod_Input")
    public WebElement methodOfCall;
    @FindBy(how = How.XPATH, using = "//*[@id=\"DropMethod_DropDown\"]/div/ul/li[5]")
    public WebElement methodType;

    @FindBy(how = How.ID, using = "CheckArea")
    public WebElement areaCheckBox;

    /*New Call Note Pop up*/

    @FindBy(how = How.ID, using = "BtnNote_ClientState")
    public WebElement newNoteButton;

    @FindBy(how = How.ID, using = "TextBox1")
    public WebElement newCallNoteComments;

    @FindBy(how = How.ID, using = "btnCancel_ClientState")
    public WebElement newNoteCancelButton;

    @FindBy(how = How.ID, using = "BtnSave_ClientState")
    public WebElement newNoteSaveButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"RadWindowWrapper_RadWindowDup\"]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li/a/span")
    public WebElement closePopUp;

    /*Cancel Dispatch*/

    @FindBy(how = How.ID, using = "btnCancel_ClientState")
    public WebElement dispatchCancelButton;

    @FindBy(how = How.ID, using = "BtnSave_ClientState")
    public WebElement dispatchSaveButton;

    /*Other Services*/

    @FindBy(how = How.XPATH, using = "//*[@id=\"RadPanelBar1\"]/ul/li[2]/a/span/span[2]")
    public WebElement otherServicesButton;

    @FindBy(how = How.ID, using = "RadPanelBar1_i2_RadGridOsi_ctl00_ctl04_RadCheckBox1")
    public WebElement DCC_checkbox;

    @FindBy(how = How.ID, using = "RadPanelBar1_i2_RadGridOsi_ctl00_ctl07_RadCheckBox1")
    public WebElement EMPD_checkbox;

    @FindBy(how = How.ID, using = "RadPanelBar1_i2_RadGridOsi_ctl00_ctl10_RadCheckBox1")
    public WebElement SAPS_checkbox;












}
