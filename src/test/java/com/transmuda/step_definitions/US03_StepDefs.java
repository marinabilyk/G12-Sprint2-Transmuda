package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.PinbarPage;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US03_StepDefs {

    PinbarPage pinbarPage = new PinbarPage();


    @When("the user clicks the {string} link")
    public void theUserClicksTheLink(String linkText) {
        pinbarPage.clickLearnHowToUseLink(); //Assuming this clicks the correct link

    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String expectedText) {
        WebElement element = pinbarPage.getTextElement(expectedText);
        Assert.assertTrue("Text not found", element.isDisplayed());

    }

    @And("the user should see an image with source {string}")
    public void theUserShouldSeeAnImageWithSource(String expectedSrc) {
        WebElement image = pinbarPage.getImageElement(expectedSrc);
        Assert.assertTrue("Image not found", image.isDisplayed());
    }
}
