package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="login")
    public WebElement usernameBox;

    @FindBy (id="password")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement logInButton;


}