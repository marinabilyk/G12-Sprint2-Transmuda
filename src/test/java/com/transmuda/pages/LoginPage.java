package com.transmuda.pages;


import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;


    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String user1, String UserUser123) {
        userName.sendKeys(user1);
        password.sendKeys(UserUser123);
        submit.click();
        // verification that we logged
    }

    // Method to log in with default credentials from configuration properties
    public void login() {
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        login(username, password);

    }
}
