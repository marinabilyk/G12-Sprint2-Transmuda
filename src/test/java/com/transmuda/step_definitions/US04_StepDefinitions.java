package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleContractsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

public class US04_StepDefinitions extends BasePage {



    VehicleContractsPage contractsPage = new VehicleContractsPage();


    @Then("the user navigates to Fleet module")
    public void theUserNavigatesToFleetModule() {

        BrowserUtils.waitFor(2);
        fleetModule.click();

    }


    @Then("user selects on Vehicle Contracts")
    public void user_selects_on_vehicle_contracts() {


        BrowserUtils.waitFor(2);

        vehicleContractsButton.click();






    }

    @Then("user sees expectedURL in the URL")
    public void user_sees_expected_url_in_the_url() {


        BrowserUtils.waitFor(2);

        String expectedURL = "https://qa.transmuda.com/entity/Extend_Entity_VehicleContract";

        BrowserUtils.verifyURLContains(expectedURL);



    }

    @Then("user sees expectedTitle is in the title")
    public void user_sees_expected_title_is_in_the_title() {



        BrowserUtils.waitFor(2);

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";

        BrowserUtils.verifyTitle(expectedTitle);


    }


    @Then("user sees error message on the screen")
    public void user_sees_error_message_on_the_screen() {

        BrowserUtils.waitFor(1);

        contractsPage.errorMessage.getText();






    }

}
