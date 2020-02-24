package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement name = driver.findElement(By.tagName("input"));
        name.sendKeys("Ali Kocaaga");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("alikocaaga@icloud.com");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement message = driver.findElement(By.tagName("h3"));
        //  String message1 = message.getText();
        //   System.out.println("message1 = " + message1);

        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}