package com.transmuda.step_definitions;

import com.transmuda.pages.AccountsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class US12_StepDefinitions {

    AccountsPage accountsPage = new AccountsPage();
    Select options;

    @When("User is on Accounts page")
    public void user_is_on_accounts_page() {
       //accountsPage.navigateToModule("Customers", "Accounts");
       //BrowserUtils.waitForVisibility(accountsPage.filterIcon, 3);

       //accountsPage.filterIcon.click();

    }

    @Then("User should be able to see filter name options below")
    public void user_should_be_able_to_see_filter_name_options_below(List<String> expectedOptions) {

        accountsPage.manageFilters.click();
        options = new Select(accountsPage.dropdown);
        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : accountsPage.filterNames) {
            actualOptions.add(each.getAttribute("innerText").trim());
        }

        Assert.assertEquals(expectedOptions,actualOptions);

        List<WebElement> selectedOptions = options.getAllSelectedOptions();
        List<WebElement> allOptions = options.getOptions();

        Assert.assertEquals(allOptions, selectedOptions);

        }

    }

