package com.fruitionconsult.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends BasePage
{
    public AboutPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#banner-text p")
    private WebElement paragraph;

    public void isFontColourCyanBlue(String colour)
    {
        waitForElementToBeClickable(paragraph);
        String paragraphColour = paragraph.getCssValue("color");
        String paragraphColourHex = Color.fromString(paragraphColour).asHex();
        Assert.assertEquals(paragraphColourHex + " is not the same as " + colour,
                paragraphColourHex, colour);
    }
}
