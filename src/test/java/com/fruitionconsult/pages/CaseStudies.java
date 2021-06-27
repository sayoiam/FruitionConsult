package com.fruitionconsult.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseStudies extends BasePage{

    public CaseStudies(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='col title'] h2")
    private WebElement proudAchievement;

    public void isProudAchievementDisplayed(String achievement)
    {
        waitForElementToBeClickable(proudAchievement);
        String proudAchievementText = proudAchievement.getText().toLowerCase();
        Assert.assertEquals(proudAchievementText + " is not equal to " + achievement,
                proudAchievementText, achievement.toLowerCase());
    }
}
