package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest extends TestBase {

    @Test
    public void test1(){

        String browser = ConfigurationReader.get("browser");
        System.out.println(browser);
    }

}
