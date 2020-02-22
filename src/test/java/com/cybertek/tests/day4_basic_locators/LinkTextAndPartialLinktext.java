package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinktext {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        link3.click();


        driver.findElement(By.linkText("Home")).click();

        driver.findElement(By.partialLinkText("Dynamic Loading")).click();

        WebElement link6 = driver.findElement(By.partialLinkText("Example 6"));
        link6.click();

        driver.findElement(By.id("username")).sendKeys("Ali Kocaaga");
        driver.findElement(By.id("pwd")).sendKeys("Tests");
        driver.findElement(By.tagName("button")).click();


    }

}