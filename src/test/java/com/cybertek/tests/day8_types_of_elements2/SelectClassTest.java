package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {
    @Test
    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate the dropdown element with unique locator

        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create select object by passing the element as a constructor

        Select stateList = new Select(dropdownElement);

        List<WebElement> options = stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }

    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate the dropdown element with unique locator

        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create select object by passing the element as a constructor

        Select stateList = new Select(dropdownElement);

        //verify that first option is "Select state"

        String expectOption = "Select a State";
        String actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectOption, "Verify select a state");


        //How to select options from the dropdown ?
        // 1. using visible text
        Thread.sleep(2000);
        stateList.selectByVisibleText("Alabama");
        actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, "Alabama");
        System.out.println(stateList.getFirstSelectedOption().getText());



        //2. using index number
        Thread.sleep(2000);
        stateList.selectByIndex(51);
        actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, "Wyoming");
        System.out.println(stateList.getFirstSelectedOption().getText());


        //3. using value

        Thread.sleep(2000);
        stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption().getText());


    }
}
