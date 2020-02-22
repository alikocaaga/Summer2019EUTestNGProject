package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import com.sun.tools.javac.api.WrappingJavaFileManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton = driver.findElement((By.cssSelector("#disappearing_button")));

        String message = dontClickButton.getText();
        System.out.println("message = " + message);

        WebElement dontClickButton2 = driver.findElement(By.cssSelector(".nav-link"));
        String message2 = dontClickButton2.getText();
        System.out.println("message2 = " + message2);


        WebElement button4 = driver.findElement(By.cssSelector("[onclick='button4()']"));
        String button4message = button4.getText();

        System.out.println("button4message = " + button4message);

        WebElement button3 = driver.findElement(By.cssSelector("button[id^=button_]"));
        String button3message = button3.getText();

        System.out.println("button3message = " + button3message);

    }

}
