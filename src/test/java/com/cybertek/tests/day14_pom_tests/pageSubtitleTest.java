package com.cybertek.tests.day14_pom_tests;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pageSubtitleTest extends TestBase {

    /*
    Test Case
    Open Browser
    Login as a drivwer
    Verify that page subtitle is quick launchpad
     */

    @Test
    public void verifySubtitleTest() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();

        String expectedSubtitle = "Quick Launchpad";
        String actualSubtitle = dashboardPage.getPageSubTitle();

        Assert.assertEquals(actualSubtitle, expectedSubtitle, "Verify Subtitle");

        // dashboardPage.navigateTo("");
        dashboardPage.navigateToModule("Activities","Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(), "Calendar Events", "Verify subtitle");


    }
}
