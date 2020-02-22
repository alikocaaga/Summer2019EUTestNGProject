package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usenameInput = driver.findElement(By.id("username"));
        System.out.println(usenameInput.isDisplayed());
        Assert.assertFalse(usenameInput.isDisplayed());

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        Thread.sleep(5000);

        System.out.println(usenameInput.isDisplayed());
        Assert.assertTrue(usenameInput.isDisplayed());

        usenameInput.sendKeys("alikocaaga");

        WebElement password = driver.findElement(By.id("pwd"));
        password.sendKeys("123456");

        WebElement submitkey = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitkey.click();
    }
}
