package com.swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    WebElement userName;
    WebElement pswName;
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        this.userName = driver.findElement(By.name("user-name"));
        this.pswName = driver.findElement(By.name("password"));
        this.loginButton = driver.findElement(By.name("login-button"));
    }

    public void enterUsername(String user) {
        userName.sendKeys(user);
    }

    public void enterPassword(String pass) {
        pswName.sendKeys(pass);
    }

    public HomePage clickLogin() {
        loginButton.click();
        return new HomePage(driver);
    }
}