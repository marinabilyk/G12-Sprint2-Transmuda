package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage_MB {
    public MainModulesPage_MB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(., 'Dashboards')]")
    public WebElement dashboardsModule;

    @FindBy(xpath = "//span[contains(., 'Fleet')]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[contains(., 'Customers')]")
    public WebElement customersModule;

    @FindBy(xpath = "//span[contains(., 'Sales')]")
    public WebElement salesModule;

    @FindBy(xpath = "//span[contains(., 'Activities')]")
    public WebElement activitiesModule;

    @FindBy(xpath = "//span[contains(., 'Marketing')]")
    public WebElement marketingModule;

    @FindBy(xpath = "//span[contains(., 'Reports & Segments')]")
    public WebElement reportsSegmentsModule;

    @FindBy(xpath = "//span[contains(., 'System')]")
    public WebElement systemModule;

    @FindBy(xpath = "//span[.='Campaigns']")
    public WebElement campaignsSubModule;
}
