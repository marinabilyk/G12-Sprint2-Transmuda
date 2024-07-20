package com.transmuda.step_definitions;

import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class CLONE_US13_StepDefs_Rufiya {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @When("user navigates to {string} tab and {string} module")
    public void user_navigates_to_tab_and_module(String tab, String module) {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        vehiclesPage.navigateToModule(tab, module);
    }

    @Then("user should be able to see below options")
    public void user_should_be_able_to_see_below(List<String> expectedOptions) {

        BrowserUtils.waitForVisibility(vehiclesPage.table, 5);

        List<String> actualOptions = BrowserUtils.getElementsText(vehiclesPage.headers, "innerText");

        Assert.assertEquals(expectedOptions,actualOptions);

    }

    @Then("user should be able to check first checkbox to select All Vehicle Costs")
    public void user_should_be_able_to_check_first_checkbox_to_select_all_vehicle_costs() {

        vehiclesPage.firstCheckBox.click();
        Assert.assertTrue(vehiclesPage.firstCheckBox.isSelected());

    }

}
