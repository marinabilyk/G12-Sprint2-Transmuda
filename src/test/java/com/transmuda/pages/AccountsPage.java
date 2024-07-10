package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage extends BasePage{

    public AccountsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='filter-item oro-drop']/div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public List<WebElement> filterOptions;

    public static List<String> getFilterOptions(List<WebElement> list) {
        List<String> getFilterOptions = new ArrayList<>();

        for (WebElement option : list) {
            getFilterOptions.add(option.getText());
        }
        return getFilterOptions;
    }

}

