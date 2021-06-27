package com.fruitionconsult.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Case Studies")
    private WebElement caseStudies;
    @FindBy(id = "menu-toggle")
    private WebElement toggle;
    @FindBy(linkText = "About Us")
    private WebElement aboutUs;
    @FindBy(linkText = "Connect with Us")
    private WebElement connect;


    private CaseStudies clickOnCaseStudies()
    {
        waitForElementToBeClickable(caseStudies);
        caseStudies.click();
        return new CaseStudies(driver);
    }

    private AboutPage clickOnAboutUs()
    {
        waitForElementToBeClickable(aboutUs);
        aboutUs.click();
        return new AboutPage(driver);
    }

    private ContactPage clickOnConnectWithUs()
    {
        waitForElementToBeClickable(connect);
        connect.click();
        return new ContactPage(driver);
    }

    public void pageTransform(String pages)
    {
        switch (pages)
        {
            case "Case Studies":
                clickOnCaseStudies();
                break;
            case "About Us":
                clickOnAboutUs();
                break;
            case "Connect With Us":
                clickOnConnectWithUs();
                break;
        }
    }

    public void clickOnToggle()
    {
        waitForElementToBeClickable(toggle);
        toggle.click();
    }

}
