package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{


    //no need to expilicitly write constructors.
    public DashboardPage () {
        PageFactory.initElements(Driver.get(),this);

    }

    public void navigateToModule() {
    }

    public void navigateToModule(String activities, String calendar_events) {
    }

}
