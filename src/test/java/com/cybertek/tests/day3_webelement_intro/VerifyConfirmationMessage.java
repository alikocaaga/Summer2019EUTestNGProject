package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox = driver.findElement(By.name("email"));
        String expectedEmail = "test@gmail.com";
        // send expected email
        emailInputBox.sendKeys(expectedEmail);


        //verify that email is displayed in the input box
        //getting text from webelements
        // gettext() --> get text from web element %99
        //getAttribute("value")--> get the value of attributes

        String actualEmail = emailInputBox.getAttribute("value");

        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FALSE");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);

            //verify that confirmation message says 'Your e-mail's been sent!'
        }
        WebElement boxclick = driver.findElement(By.id("form_submit"));
        boxclick.click();

        String expectedMessage = "Your e-mail's been sent!";

        WebElement message = driver.findElement(By.name("confirmation_message"));

        String actualMessage = message.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FALSE");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);

        }


        driver.quit();

    }
}
