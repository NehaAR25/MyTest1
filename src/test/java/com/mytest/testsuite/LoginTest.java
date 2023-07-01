package com.mytest.testsuite;

import com.mytest.pages.HomePage;
import com.mytest.pages.LoginPage;
import com.mytest.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");

    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "Error message not displayed");

    }

}
