package com.cybertek.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions action;
    protected WebDriverWait wait;
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;


@BeforeTest
public void setUpTest(){
    report = new ExtentReports();

    String projectPath = System.getProperty("user.dir");
    String path = projectPath + "/test-output/report.html";

    htmlReporter = new ExtentHtmlReporter(path);
    report.attachReporter(htmlReporter);

    htmlReporter.config().setReportName("Vytrack smoke test");

    report.setSystemInfo("Environment", "QA");
    ;
    report.setSystemInfo("Browser", "chrome");
    report.setSystemInfo("Tester", "Europe Testers");


}


    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        action = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));

    }
    @AfterTest
    public void teardown() {
        report.flush();

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
