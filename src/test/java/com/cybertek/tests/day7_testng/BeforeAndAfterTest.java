package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void test1() {
        System.out.println("This is test 1");


        // beginning of the each test
        //webdriver code
        // driver.get open browser
        // maximize window

        //after each
        // close browser


    }

    @Test
    public void test2 (){
        System.out.println("test2 ");
    }

    @Test
    public void test3 (){
        System.out.println("test3 ");
    }
    @BeforeMethod
    public void setupMethod(){

        System.out.println("before Method");
        System.out.println("opening the browser");
    }
@AfterMethod
    public void AfterMethod (){
    System.out.println("close browser");
}
@BeforeClass
    public void beforerClass(){
    System.out.println("Before Class");
}
@AfterClass
    public void afterClass (){
    System.out.println("After Class");
}
}
