package com.fruitionconsult.pages;

import com.fruitionconsult.commons.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Configuration;
import utils.Environment;

import java.io.IOException;

public class BasePage extends Driver {
    public String BASE_URL;

    private String url()
    {
        try {
            if(new Environment().specifiedEnvironment() == null)
            {
                BASE_URL = new Configuration().getPropertiesParameter("prodUrl");
            } else
            {
                BASE_URL = new Environment().specifiedEnvironment();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BASE_URL;
    }


    public void launchUrl()
    {
        driver.navigate().to(url());
    }

    public void waitForElementToBeClickable(WebElement element)
    {
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
