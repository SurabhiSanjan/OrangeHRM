package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
WebDriver driver;
@CacheLookup
    @FindBy(id = "txtUsername")
    WebElement username;

    @CacheLookup
    @FindBy(id = "txtPassword")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div[1]/div[2]/div/form/div[3]/button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void login() throws InterruptedException {
        username.sendKeys("Admin");
        Thread.sleep(500);
        password.sendKeys("L@UwVxzE73");
        Thread.sleep(500);
        loginButton.click();
        Thread.sleep(3000);
    }
    public void redirectOnToTheHomePage() {
        String title = driver.getTitle();
        Assert.assertEquals("Employee Management",title);
    }

}
