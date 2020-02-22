package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {

    public static void main(String[] args) {

    WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.amazon.com");

      WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
      search.sendKeys("selenium");

      WebElement clickbutton = driver.findElement(By.xpath("//input[@value='Go']"));
      clickbutton.click();


      WebElement dfg = driver.findElement(By.id("button_b1"));
      dfg.click();
    }
}
