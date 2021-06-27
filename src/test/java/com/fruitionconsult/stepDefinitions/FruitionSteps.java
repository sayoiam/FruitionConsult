package com.fruitionconsult.stepDefinitions;

import com.fruitionconsult.pages.BasePage;
import com.fruitionconsult.pages.CaseStudies;
import com.fruitionconsult.pages.ContactPage;
import com.fruitionconsult.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FruitionSteps extends BasePage {

    HomePage homePage = new HomePage(driver);
    CaseStudies caseStudies = new CaseStudies(driver);
    ContactPage contactPage = new ContactPage(driver);

    @Given("I navigate to fruitionConsult homepage")
    public void i_navigate_to_fruition_consult_homepage() {
        homePage.launchUrl();
    }

    @When("I click on {string} tab")
    public void i_click_on_tab(String page) {
        homePage.pageTransform(page);
    }
    @Then("{string} is displayed")
    public void is_displayed(String achievement) {
        caseStudies.isProudAchievementDisplayed(achievement);
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {
        contactPage.submitEmptyForm();
    }

    @Then("an error message is displayed")
    public void an_error_message_is_displayed() {
        contactPage.isErrorMessageDisplayed();
    }
}
