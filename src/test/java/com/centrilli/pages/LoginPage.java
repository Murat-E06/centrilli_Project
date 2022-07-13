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

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginPasswordMessage;

    @FindBy(xpath = "//a[@class='btn btn-link pull-right']")
    public WebElement resetPasswordLink;

    @FindBy(linkText = "Reset Password")
    public WebElement resetPasswordLink2;









}
