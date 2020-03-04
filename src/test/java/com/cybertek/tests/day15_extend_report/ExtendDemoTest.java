package com.cybertek.tests.day15_extend_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ExtendDemoTest {
    //this class is used for starting and building reports
    ExtentReports report;

    //this class is used to create the HTML report file
    ExtentHtmlReporter htmlReporter;

    //this will define a test, enables adding logs, authors, test steps
    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp() {
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

    @Test
    public void tets1() {
        extentLogger = report.createTest("TC342 Login");
        extentLogger.info("Open Chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter drive info");
        extentLogger.info("verify logged in");
        extentLogger.info("Test passed");

    }

    @AfterMethod
    public void teardown() {
        report.flush();

    }

}
