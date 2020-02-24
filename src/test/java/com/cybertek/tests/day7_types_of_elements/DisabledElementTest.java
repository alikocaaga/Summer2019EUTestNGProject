package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElementTest {
    @Test
    public void test1() {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement green = driver.findElement(By.id("green"));

        System.out.println("green.isEnabled() = " + green.isEnabled());


        green.click();

        driver.quit();

    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");


        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
        button.click();
        wait(500);
        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));
        inputBox.sendKeys("Mike Smith");
        System.out.println("inputBox.isEnabled() = " + inputBox.isEnabled());




    }
}