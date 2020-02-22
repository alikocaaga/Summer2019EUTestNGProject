package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void setDriver() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));
        WebElement red = driver.findElement(By.id("red"));
        WebElement yellow = driver.findElement(By.id("yellow"));
        WebElement black = driver.findElement(By.id("black"));

        System.out.println("blue.isSelected()= " + blue.isSelected());
        System.out.println("red.isSelected() = " + red.isSelected());

        blue.click();
        red.click();
        yellow.click();
        black.click();

        Assert.assertTrue(black.isSelected(),"Verify that black button is selected");
        Assert.assertFalse(red.isSelected(),"Verify that red button is selected");

        driver.quit();
    }
}
