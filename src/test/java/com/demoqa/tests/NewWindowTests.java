package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.BrowserWindows;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTests extends TestBase{

    @BeforeMethod
    public void precondtition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWindow().hideIframes();
    }

    @Test
    public void newTabTest(){
        new BrowserWindows(driver).switchToNewTab(1).verifyNewTabTitle("This is a sample page");

    }
}
