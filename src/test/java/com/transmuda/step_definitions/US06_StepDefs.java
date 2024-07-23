package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.*;

public class US06_StepDefs extends BasePage {

    VehiclesPage vehiclesPage = new VehiclesPage();


    @When("the user selects on Vehicles")
    public void the_user_selects_on_vehicles() {


        BrowserUtils.waitFor(2);

        vehiclesButton.click();


    }

    @Then("user hovers the mouse over three dots and see edit info icons")
    public void userHoversTheMouseOverThreeDotsAndSeeEditInfoIcons() {

        BrowserUtils.hover(vehiclesPage.editInfoIcons); //Three dots

        BrowserUtils.waitFor(2);

        String actualEditIcons = vehiclesPage.editInfoIcons.getAttribute("class");

        String expectedEditIcons = "dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu";

        Assert.assertEquals(actualEditIcons, expectedEditIcons);
    }
}







