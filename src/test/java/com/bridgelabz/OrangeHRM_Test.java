package com.bridgelabz;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM_Test extends BaseClass{
    LoginPage login2;
    @BeforeMethod
    public void initialization(){
        setting();
        login2 = new LoginPage(driver);
    }
@Test(priority = 0)
    public void login_to_OrangeHRM() throws InterruptedException {
        login2.login();
    }
    @AfterMethod
    public void tearDown() {
        closeWindow();
    }
    }
