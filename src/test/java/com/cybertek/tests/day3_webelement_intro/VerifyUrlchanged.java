package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlchanged {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");



        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("email@gmai.com");
        WebElement emailClick = driver.findElement(By.id("form_submit"));
        emailClick.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        String expectedUrl ="http://practice.cybertekschool.com/email_sent";
        System.out.println("expectedUrl = " + expectedUrl);

        if( currentUrl.equals(expectedUrl)){
            System.out.println("PASSED");
        }else {
            System.out.println("FALSE");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("currentUrl = " + currentUrl);
        }
        driver.quit();
    }
}
