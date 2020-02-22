package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        driver.findElement(By.tagName("button")).click();

        //find the username inputbox

        WebElement username = driver.findElement(By.id("username"));

        //how to wait explicity?
        //Create Explicit wait object

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // call untill method from wait object
        // waiting for the specific element to be visible (up to 10 sec)
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("Mike Smith");




    }

    @Test
    public void test2 (){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();

        WebElement inputbox = driver.findElement(By.cssSelector("input[type='text']"));

        WebDriverWait wait2 = new WebDriverWait(driver,10);
        wait2.until(ExpectedConditions.elementToBeClickable(inputbox));
        inputbox.sendKeys("Deneme");

    }
}
