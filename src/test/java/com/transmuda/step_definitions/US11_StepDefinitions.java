package com.transmuda.step_definitions;

import com.transmuda.pages.AccountsPage;
import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefinitions  {

    LoginPage loginPage = new LoginPage();
    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
    AccountsPage accountsPage = new AccountsPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://qa.transmuda.com/");
    }
    @Given("user is logged in as store manager")
    public void user_is_logged_in_as_store_manager() {
       loginPage.userName.sendKeys("storemanager51");
       loginPage.password.sendKeys("UserUser123");
       loginPage.submit.click();
    }
    @When("user is on Dashboard")
    public void user_is_on_dashboard() {
        BrowserUtils.sleep(3);
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }
    @When("user hover over Fleet")
    public void user_hover_over_fleet() {
     accountsPage.navigateToModule("Fleet", "Vehicle Odometer");


}

    @Given("user is logged in as sales manager")
    public void userIsLoggedInAsSalesManager() {
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
    }

    @And("user Selects Vehicle odometer")
    public void userSelectsVehicleOdometer() {
        accountsPage.navigateToModule("Fleet", "Vehicle Odometer");
    }

    @Then("user should see error message on screen")
    public void userShouldSeeErrorMessageOnScreen() {
        String actualErrorMessage = vehicleOdometerPage.permissionErrorMessage.getText();
        String expectedErrorMessage = "You do not have permission to perform this action.";
        Assert.assertTrue(expectedErrorMessage.contains(actualErrorMessage));
    }

    @Given("user is logged in as Driver")
    public void userIsLoggedInAsDriver() {
        loginPage.userName.sendKeys("user1");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
    }

    @When("user is on dashboard")
    public void userIsOnDashboard() {
        BrowserUtils.sleep(3);
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }

    @Then("user should see default page as {int}")
    public void userShouldSeeDefaultPageAs(int defaultPageNumber) {
        String actualPageNumber = vehicleOdometerPage.defaultPageNumber.getText();
        String expectedPageNumber = String.valueOf(actualPageNumber);
        Assert.assertTrue(actualPageNumber.contains(expectedPageNumber));
    }

    @Then("user should see view per page {int} by default.")
    public void userShouldSeeViewPerPageByDefault(int viewsPerPage) {
        String actualViewsPerPage = vehicleOdometerPage.viewsPerPage.getText();
        String expectedViewsPerPage = String.valueOf(viewsPerPage);
        Assert.assertTrue(actualViewsPerPage.contains(expectedViewsPerPage));
    }
}
