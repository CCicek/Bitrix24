package com.EU2_Group10.pages;


import com.EU2_Group10.utilities.ConfigurationReader;
import com.EU2_Group10.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //same with driver.findElement(By.id("prependedInput"));


    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    public void login(String usernameStr,String passwordStr){

        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();

    }

    public void loginAsHelpDesk(){
        String username = ConfigurationReader.get("HelpDesk_username");
        String password = ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsMarketing() {
        String username = ConfigurationReader.get("Marketing_username");
        String password = ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsHR() {
        String username = ConfigurationReader.get("HR_username");
        String password = ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
}