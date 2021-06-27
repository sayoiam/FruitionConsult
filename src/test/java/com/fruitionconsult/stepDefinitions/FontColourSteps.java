package com.fruitionconsult.stepDefinitions;

import com.fruitionconsult.pages.AboutPage;
import com.fruitionconsult.pages.BasePage;
import com.fruitionconsult.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FontColourSteps extends BasePage {

    AboutPage aboutPage = new AboutPage(driver);
    HomePage homePage = new HomePage(driver);

    @When("I click the toggle bar")
    public void i_click_the_toggle_bar() {
        homePage.clickOnToggle();
    }

    @Then("the font colour of the paragraph should be {string}")
    public void the_font_colour_of_the_paragraph_should_be(String color) {
        aboutPage.isFontColourCyanBlue(color);
    }
}
