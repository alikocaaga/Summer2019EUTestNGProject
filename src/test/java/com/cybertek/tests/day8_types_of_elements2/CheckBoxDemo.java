package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[2]"));

        //verify that checkbox 1 is unselected and 2 is selected

  //      checkBox1.click();
   //     checkBox2.click();

        Assert.assertTrue(checkBox2.isSelected());
        Assert.assertFalse(checkBox1.isSelected());

        System.out.println("checkBox1 = " + checkBox1.isSelected());
        System.out.println("checkBox2 = " + checkBox2.isSelected());
    }
}
