package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.MainPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();
    MainPage mainPage = new MainPage();



    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));

    }
    @When("user enters valid {string} to the username box")
    public void user_enters_valid_to_the_username_box(String string) {
        string=ConfigurationReader.getProperty("username");
        loginPage.usernameBox.sendKeys(string);

    }
    @When("user enters valid {string} to the password box")
    public void user_enters_valid_to_the_password_box(String string) {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks the log in button")
    public void user_clicks_the_log_in_button() {
        BrowserUtils.clickWithJS(loginPage.logInButton);
    }
    @Then("user should be navigate to main page")
    public void user_should_be_navigate_to_main_page() {
        BrowserUtils.waitForVisibility(mainPage.searchBox,10);
        Assert.assertTrue(mainPage.searchBox.isDisplayed());
    }
}
