package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CampaignsPage_MB {
    public CampaignsPage_MB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[contains(@class, 'ui-multiselect')]")
    public WebElement manageFilters;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement showFilters;

    @FindBy(id = "ui-multiselect-0-0-option-0")
    public WebElement filterOptionName;

    @FindBy(id = "ui-multiselect-0-0-option-1")
    public WebElement filterOptionCode;

    @FindBy(id = "ui-multiselect-0-0-option-2")
    public WebElement filterOptionStartDate;

    @FindBy(id = "ui-multiselect-0-0-option-3")
    public WebElement filterOptionEndDate;

    @FindBy(id = "ui-multiselect-0-0-option-4")
    public WebElement filterOptionBudget;


    public static void uncheckFilterCheckbox(String checkboxName){

        CampaignsPage_MB campaignsPageMb = new CampaignsPage_MB();

        switch (checkboxName) {
            case "Name":
                campaignsPageMb.filterOptionName.click();
                Assert.assertFalse(campaignsPageMb.filterOptionName.isSelected());
                break;
            case "Code":
                campaignsPageMb.filterOptionCode.click();
                Assert.assertFalse(campaignsPageMb.filterOptionCode.isSelected());
                break;
            case "Start Date":
                campaignsPageMb.filterOptionStartDate.click();
                Assert.assertFalse(campaignsPageMb.filterOptionStartDate.isSelected());
                break;
            case "End Date":
                campaignsPageMb.filterOptionEndDate.click();
                Assert.assertFalse(campaignsPageMb.filterOptionEndDate.isSelected());
                break;
            case "Budget":
                campaignsPageMb.filterOptionBudget.click();
                Assert.assertFalse(campaignsPageMb.filterOptionBudget.isSelected());
                break;
        }
    }
}
