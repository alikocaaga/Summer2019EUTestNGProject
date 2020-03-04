package com.cybertek.tests.day14_pom_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void wrongPasswordTest(){

        //how to use page object model locators?
        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("user1");
        loginPage.passwordInput.sendKeys("somepassword");
        loginPage.loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");


    }

    @Test
    public void wrongUsername(){

        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("some");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login1");
    }

}
