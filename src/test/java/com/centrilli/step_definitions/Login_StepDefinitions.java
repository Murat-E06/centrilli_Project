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
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(loginPage.logInButton);//more comfortable
      //  loginPage.logInButton.click();
    }

    @Then("user should be navigate to main page")
    public void user_should_be_navigate_to_main_page() {
        BrowserUtils.waitForVisibility(mainPage.searchBox,10);
        Assert.assertTrue(mainPage.searchBox.isDisplayed());
    }
    @When("user enters invalid {string} to the password box")
    public void user_enters_invalid_to_the_password_box(String string) {
        loginPage.passwordBox.sendKeys("invalid password");

    }
    @Then("Verify that {string} message is displayed")
    public void verify_that_message_is_displayed(String string) {
        Assert.assertTrue(loginPage.wrongLoginPasswordMessage.isDisplayed());

    }

    @Then("user sees Please fill out this field message")
    public void user_sees_please_fill_out_this_field_message() {
      String fillOutMessage= loginPage.passwordBox.getAttribute("validationMessage");
        Assert.assertEquals("Lütfen bu alanı doldurun.",fillOutMessage);
    }
    @When("user enters valid {string} to the username box for salesmanagers")
    public void user_enters_valid_to_the_username_box_for_salesmanagers(String string) {
        loginPage.usernameBox.sendKeys(string);

    }
    @When("user enters valid {string} to the password box for salesmanagers")
    public void user_enters_valid_to_the_password_box_for_salesmanagers(String string) {
        loginPage.passwordBox.sendKeys(string);
    }

    @When("user enters invalid {string} to the username box")
    public void user_enters_invalid_to_the_username_box(String string) {
       loginPage.usernameBox.sendKeys("invalid username");
    }

    @When("user clicks Reset Password link")
    public void user_clicks_reset_password_link() {
        loginPage.resetPasswordLink2.click();


    }
    @Then("user sees Your Email  box")
    public void user_sees_your_email_box() {
        //Assert.assertTrue(loginPage.usernameBox.isDisplayed());
        BrowserUtils.waitFor(3);
        String expectedURL="https://qa.centrilli.com/web/reset_password?";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }




}
