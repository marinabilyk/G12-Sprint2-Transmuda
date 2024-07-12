package com.transmuda.step_definitions;

import com.transmuda.pages.AccountsPage;
import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    AccountsPage accountsPage = new AccountsPage();
    Actions actions = new Actions(Driver.getDriver());

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
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }
    @When("user hover over Fleet")
    public void user_hover_over_fleet() {
     actions.moveToElement(basePage.menuOptions.get(1));
    }
    @When("user Selects Vehicle odometer")
    public void user_selects_vehicle_odometer() {
        accountsPage.navigateToModule("Fleet", "Vehicle Odometer");
    }
    @Then("user should see error message on screen")
    public void user_should_see_error_message_on_screen() {
     String actualErrorMessage = basePage.permissionErrorMessage.getText();
     String expectedErrorMessage = "You do not have permission to perform this action.";
        Assert.assertTrue(expectedErrorMessage.contains(actualErrorMessage));
    }


    @Given("user is logged in as sales manager")
    public void userIsLoggedInAsSalesManager() {
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
    }

    @Given("user is logged in as Driver")
    public void userIsLoggedInAsDriver() {
        loginPage.userName.sendKeys("user1");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
    }

    @When("user is on dashboard")
    public void userIsOnDashboard() {
        Driver.getDriver().getTitle();
    }

    @Then("user should see default page as {int}")
    public void userShouldSeeDefaultPageAs(int defaultPageNumber) {
       basePage.defaultPageNumber.getText().equals(defaultPageNumber);

    }

    @Then("user should see view per page {int} by default.")
    public void userShouldSeeViewPerPageByDefault(int viewPerPage) {
        basePage.viewsPerPage.getText().equals(viewPerPage);
    }
}
