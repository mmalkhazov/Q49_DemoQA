package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.bookStore.LoginPage;
import com.demoqa.pages.bookStore.ProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
        public void precondition(){
            new HomePage(driver).getBookStore();
            new SidePanel(driver).selectLogin().hideIframes();
    }


    @Test
    public void loginPositiveTest(){
        new LoginPage(driver)
                .enterUserData("maynard123@gmail.com", "Maynard@gmail1234")
                .clickOnLoginButton();
        new ProfilePage(driver).verifyUserName("maynard123@gmail.com");

    }
}
