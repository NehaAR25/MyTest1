package project.my.pages;

import org.openqa.selenium.By;
import project.my.utilities.Utility;

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

