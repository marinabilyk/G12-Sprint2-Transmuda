package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;
import java.util.List;
import java.util.Set;

public class VehiclesPage {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle']/input[@type='checkbox'])[1]")
    public WebElement firstCheckButton;

    @FindBy(xpath = "(//td[@class='select-row-cell renderable grid-cell grid-body-cell grid-body-cell-massAction']/input[@type='checkbox'])[2]")
    public WebElement secondCheckButton;

    @FindBy(xpath = "//tbody[@class='grid-body']//tr")
    public Set<WebElement> gridBody;

    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[1]")
    public WebElement editInfoIcons;




    @FindBy (xpath = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[1]")
    public WebElement dropDownIcons;




}

