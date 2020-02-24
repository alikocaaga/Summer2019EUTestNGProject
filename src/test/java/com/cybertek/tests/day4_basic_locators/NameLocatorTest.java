package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement dullNameinput = driver.findElement(By.name("full_name"));
        dullNameinput.sendKeys("Mike Smith");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("alikocaaga@gmail.com");

        WebElement button = driver.findElement(By.name("wooden_spoon"));
        button.click();

        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }


        //verify mesaage


    }
}
