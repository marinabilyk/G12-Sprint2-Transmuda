package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.CampaignsPage_MB;
import com.transmuda.pages.MainModulesPage_MB;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US14_MarketingPage_StepDefs_MB extends BasePage {
    CampaignsPage_MB campaignsPageMb = new CampaignsPage_MB();
    MainModulesPage_MB mainModulesPageMb = new MainModulesPage_MB();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user navigates to Campaigns page MB")
    public void user_navigates_to_campaigns_page_mb() {
        waitUntilLoaderScreenDisappear();
        mainModulesPageMb.marketingModule.click();
        mainModulesPageMb.campaignsSubModule.click();
    }

    @And("user clicks on Manage filters drop down MB")
    public void userClicksOnManageFiltersDropDownMB() {
        wait.until(ExpectedConditions.elementToBeClickable(campaignsPageMb.manageFilters));
        campaignsPageMb.manageFilters.click();
    }

    @Then("user sees all filter options are checked by default MB")
    public void userSeesAllFilterOptionsAreCheckedByDefaultMB(List<String> filters) {

        List<String> actualAsString = new ArrayList<>();
        actualAsString.addAll(Arrays.asList(
                campaignsPageMb.filterOptionName.getAttribute("title"),
                campaignsPageMb.filterOptionCode.getAttribute("title"),
                campaignsPageMb.filterOptionStartDate.getAttribute("title"),
                campaignsPageMb.filterOptionEndDate.getAttribute("title"),
                campaignsPageMb.filterOptionBudget.getAttribute("title")
        ));

        Assert.assertEquals(filters, actualAsString);
        Assert.assertTrue("Name is not selected", campaignsPageMb.filterOptionName.isSelected());
        Assert.assertTrue("Code is not selected", campaignsPageMb.filterOptionCode.isSelected());
        Assert.assertTrue("Start Date is not selected", campaignsPageMb.filterOptionStartDate.isSelected());
        Assert.assertTrue("End Date is not selected", campaignsPageMb.filterOptionEndDate.isSelected());
        Assert.assertTrue("Budget is not selected", campaignsPageMb.filterOptionBudget.isSelected());
    }

    @And("user clicks on Filters button MB")
    public void userClicksOnFiltersButtonMb() {
        campaignsPageMb.showFilters.click();
    }

    @Then("user clicks on {string} checkbox and sees it is unchecked")
    public void userClicksOnCheckboxAndSeesItIsUnchecked(String checkboxName) {

        CampaignsPage_MB.uncheckFilterCheckbox(checkboxName);
    }
}
