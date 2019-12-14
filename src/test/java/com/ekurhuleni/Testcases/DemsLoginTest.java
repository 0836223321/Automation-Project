package com.ekurhuleni.Testcases;

import Base.Page;
import com.ekurhuleni.DemsPages.Actions.DemsLoginPage;
import org.testng.annotations.Test;

public class DemsLoginTest {
    @Test
    public void demsLogin() throws InterruptedException {

        Page.initConfiguration();
        DemsLoginPage demsLoginPage = new DemsLoginPage();
        demsLoginPage.setDemsLoginLocators("Suresh", "Password@1");
//        Page.quitBrowser();

    }

}
