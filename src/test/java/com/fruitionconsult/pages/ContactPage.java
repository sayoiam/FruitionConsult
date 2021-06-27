package com.fruitionconsult.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h2.gform_submission_error.hide_summary")
    private WebElement errorMessage;
    @FindBy(id = "gform_submit_button_1")
    private WebElement submit;


    public void isErrorMessageDisplayed()
    {
        waitForElementToBeClickable(errorMessage);
        Assert.assertTrue("Error message is not displayed as expected ",
                errorMessage.isDisplayed());
    }

    public void submitEmptyForm()
    {
        waitForElementToBeClickable(submit);
        submit.click();
    }
}
