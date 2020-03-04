package com.cybertek.tests.day15_pom_tests;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

/*
Verify Radio Buttons

open browser
Login as a Driver
Go to Activities>Calendar Evenets
Click on create calendar events
Click on repeat
Verify that repeat every days is checked
Verify that repeat weekday is not checked

 */
public class RepeatOptionsTests extends TestBase {
    @Test
    public void RepeatRadioButtonTest(){
        // Login as driver
        LoginPage loginPage = new LoginPage();
      /*  String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
        BrowserUtils.wait(3000);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateTo("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.createCalendarEvent.click();
*/

      loginPage.login("storemanager85","UserUser123");
      loginPage.navigateTo("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.createCalendarEvent.click();



    }


}
