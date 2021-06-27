package com.fruitionconsult.hooks;

import com.fruitionconsult.commons.Browsers;
import com.fruitionconsult.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Configuration;

import java.io.IOException;
import java.util.Properties;

public class Hook extends Browsers {

    @Before
    public void setUp()
    {
        try {
            launchBrowser(new Configuration().getPropertiesParameter("browser"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
