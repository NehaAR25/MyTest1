package com.mytest.pages;

import com.mytest.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnResisterLink(){
        clickOnElement(registerLink);
    }
}

