package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage extends BasePage{

    public CalendarEventsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@title ='Create Calendar event']")
    public WebElement create_calendar_event_button;

    @FindBy(id = "recurrence-repeat-view1244")
    public WebElement repeatCheckbox;

    @FindBy(id = "//label[@class='fields-row']/input[3]")
    public WebElement valueRepeatEvery;

}
