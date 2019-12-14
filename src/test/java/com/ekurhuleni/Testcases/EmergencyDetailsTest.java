package com.ekurhuleni.Testcases;

import Base.Page;
import com.ekurhuleni.DemsPages.Actions.DemsLoginPage;
import com.ekurhuleni.DemsPages.Actions.EmergencyDetailsPage;
import org.testng.annotations.Test;

public class EmergencyDetailsTest {

    @Test
    public void captureCall() throws InterruptedException {

        Page.initConfiguration();
        DemsLoginPage demsLoginPage = new DemsLoginPage();
        demsLoginPage.setDemsLoginLocators("Suresh", "Password@1");
        EmergencyDetailsPage emergencyDetailsPage = new EmergencyDetailsPage();
        emergencyDetailsPage.callerDetailsScreen("Thandeka", "0836229921","Flood on Streets");
        emergencyDetailsPage.locationScreen("Kemp");
        emergencyDetailsPage.dispatchScreen("Johannesburg", "Testing");

    }
}
