package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTNAssertionsDemo {

    @Test
    public void test1() {

        Assert.assertEquals("12", "12");
        System.out.println("Second test");

        Assert.assertEquals("one", "One");
        System.out.println("First test");

        System.out.println("son");


    }

    @Test
    public void test2() {

        Assert.assertEquals("21", "21");
        System.out.println("second test");
    }

    @Test
    public void test3() {

        String actualtitle = "Cybertek";
        String axpectTitleBegening = "g";

        actualtitle.startsWith(axpectTitleBegening);
        Assert.assertTrue(actualtitle.startsWith(axpectTitleBegening),"Kontrol et");

    }

    @Test
    public void test4(){

        String actual = "alikocaaga@gmail.com";
        String expectedcontain ="@";

        actual.contains(expectedcontain);
        Assert.assertTrue(actual.contains(expectedcontain));
    }

    @Test
    public void test5(){

        Assert.assertTrue("alikocaaga@gmail.com".contains("@"),"Verify @ in email");
        Assert.assertNotEquals("21","34");
        Assert.assertFalse(3>23);

    }
}
