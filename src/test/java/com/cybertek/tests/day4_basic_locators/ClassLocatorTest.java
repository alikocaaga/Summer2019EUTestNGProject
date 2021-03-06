package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        System.out.println(driver.findElement(By.className("h3")).getText());
        String actual = driver.findElement(By.className("h3")).getText();
        String expected = "Multiple buttons";

        if(actual.equals(expected)){
            System.out.println("Passed");

        }else {
            System.out.println("False");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
        driver.quit();


    }
    }
