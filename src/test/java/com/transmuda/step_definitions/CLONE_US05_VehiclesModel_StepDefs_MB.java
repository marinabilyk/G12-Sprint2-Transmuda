package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.VehiclesModelPage_MB;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CLONE_US05_VehiclesModel_StepDefs_MB extends BasePage {

    VehiclesModelPage_MB vehiclesModelPageMb = new VehiclesModelPage_MB();

    @When("the user navigates to {string} tab and {string} module")
    public void the_user_navigates_to_tab_and_module(String tab, String module) {
        waitUntilLoaderScreenDisappear();
        navigateToModule(tab, module);
    }


    @Then("user sees columns below")
    public void userSeesColumnsBelow(List<String> columns) {
        waitUntilLoaderScreenDisappear();
        List<String> actualColumns = new ArrayList<>();
        actualColumns.add(vehiclesModelPageMb.modelNameColumn.getText());
        actualColumns.add(vehiclesModelPageMb.makeColumn.getText());
        actualColumns.add(vehiclesModelPageMb.canBeRequestedColumn.getText());
        actualColumns.add(vehiclesModelPageMb.cvviColumn.getText());
        actualColumns.add(vehiclesModelPageMb.co2FeeColumn.getText());
        actualColumns.add(vehiclesModelPageMb.costColumn.getText());
        actualColumns.add(vehiclesModelPageMb.totalCostColumn.getText());
        actualColumns.add(vehiclesModelPageMb.co2EmissionsColumn.getText());
        actualColumns.add(vehiclesModelPageMb.fuelTypeColumn.getText());
        actualColumns.add(vehiclesModelPageMb.vendorsColumn.getText());

        Assert.assertEquals(columns, actualColumns);

    }

    @Then("user sees {string} error message")
    public void userSeesErrorMessage(String errorMessage) {
        errorMessageIsDisplayed(errorMessage);
    }
}

