package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage  {

    public MainPage(){

      PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;


}
