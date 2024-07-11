package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


}
