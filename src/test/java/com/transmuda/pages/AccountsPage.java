package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage extends BasePage{

    public AccountsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='filter-container']/div/ul/li/label/span")
    public List<WebElement> filterNames;

    @FindBy(xpath = "//div[@class='filter-container']/button")
    public WebElement manageFilters;

    @FindBy(xpath = "//select[@data-action='add-filter-select']")
    public WebElement dropdown;

    @FindBy(xpath = "//div[@class='actions-panel pull-right form-horizontal']/div/a[1]")
    public WebElement filterIcon;

    
    }



