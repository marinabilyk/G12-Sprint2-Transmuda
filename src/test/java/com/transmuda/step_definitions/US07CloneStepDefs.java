package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07CloneStepDefs extends BasePage {
    VehiclesPage vehiclesPage = new VehiclesPage();
    @When("User clicks Fleet tab")
    public void user_clicks_fleet_tab() {
        BrowserUtils.waitForPageToLoad(3);
        fleetModule.click();
    }

    @When("User chooses Vehicles link")
    public void user_chooses_vehicles_link() {
        vehiclesButton.click();

    }

    @When("User sees all unchecked checkboxes")
    public void user_sees_all_unchecked_checkboxes() {
        Assert.assertTrue(!vehiclesPage.firstCheckButton.isSelected());
        System.out.println("CheckBoxes are not selected");
    }

    @When("User clicks on first checkbox to check all the cars")
    public void user_clicks_on_first_checkbox_to_check_all_the_cars() {
        vehiclesPage.firstCheckButton.click();
    }

    @When("User unchecks first checkbox")
    public void user_unchecks_first_checkbox() {
        vehiclesPage.firstCheckButton.click();
    }

    @Then("User selects a random car")
    public void user_selects_a_random_car() {
        vehiclesPage.secondCheckButton.click();
    }
}
