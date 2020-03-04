package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.W3CHttpCommandCodec;

public class XpathTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       WebElement homebutton = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        homebutton.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement xdrf = driver.findElement(By.xpath("/html/body/div/div/div/div/p"));
        System.out.println(xdrf.getText());
    }
}
