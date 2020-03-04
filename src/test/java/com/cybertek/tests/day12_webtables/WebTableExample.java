package com.cybertek.tests.day12_webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableExample {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void printTable() {
        WebElement table = driver.findElement(By.id("table1"));
        String wholetable = table.getText();

        Assert.assertTrue(wholetable.contains("fbach1@yahoo.com"), "Verify fbach@yahoo.comis in the table");

    }

    @Test
    public void getAllHeaders() {
        // how many columns we have?
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());

        //print each column name one by one
        for (WebElement header : headers) {
            System.out.println(header.getText());

        }
    }

    @Test
    public void printTableSize() {

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());

        // number of rows with header

        List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println(AllRows.size());

        List<WebElement> witoutheaders = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        System.out.println(witoutheaders.size());


    }

    @Test
    public void getRow() {

        WebElement secondRow = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
        System.out.println("secondRow.getText() = " + secondRow.getText());

        //get all rows dynamically. we can do in 2 steps
        //1. get the number of rows
        //based on number of rows, iterate each row

        List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='table2']"));
        for (WebElement allrow : allrows) {
            System.out.println(allrow.getText());

        }


    }

    @Test
    public void singlerow() {

        WebElement siglerow = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]"));
        System.out.println("siglerow.getText() = " + siglerow.getText());
    }

    @Test
    public void printAllCellByIndex() {

        int rownumber = getNumberOfRows();

        int colNumber = getNumberOfColumns();

        for (int i = 1; i <= rownumber; i++) {
            for (int j = 1; j <= colNumber; j++) {

                String xpath = "//table[@id='table1']//tbody/tr[i]/td[j]";


         WebElement allthings = driver.findElement(By.xpath(xpath));
              allthings.getText();
                System.out.println(allthings);

            }

        }
    }

    private int getNumberOfRows() {
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRows.size();
    }
    private int getNumberOfColumns (){
        List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return allColumns.size();
    }

    @Test
    public void StaleTest(){
        driver.get("http://google.com");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Kocaaga" + Keys.ENTER);

        WebElement results = driver.findElement(By.id("resultStats"));
        Assert.assertTrue(results.isDisplayed());
    }
}