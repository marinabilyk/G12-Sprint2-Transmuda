package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesModelPage_MB {
    public VehiclesModelPage_MB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//th[contains(@class, 'ModelName')]")
   public WebElement modelNameColumn;

    @FindBy(xpath = "//th[contains(@class, 'Make')]")
    public WebElement makeColumn;

    @FindBy(xpath = "//th[contains(@class, 'Canberequested')]")
    public WebElement canBeRequestedColumn;

    @FindBy(xpath = "//th[contains(@class, 'CatalogValue')]")
    public WebElement cvviColumn;

    @FindBy(xpath = "//th[contains(@class, 'CO2Fee')]")
    public WebElement co2FeeColumn;

    @FindBy(xpath = "//th[contains(@class, 'Cost')][1]")
    public WebElement costColumn;

    @FindBy(xpath = "//th[contains(@class, 'TotalCost')]")
    public WebElement totalCostColumn;

    @FindBy(xpath = "//th[contains(@class, 'CO2Emissions')]")
    public WebElement co2EmissionsColumn;

    @FindBy(xpath = "//th[contains(@class, 'FuelType')]")
    public WebElement fuelTypeColumn;

    @FindBy(xpath = "//th[contains(@class, 'Vendors')]")
    public WebElement vendorsColumn;

}
