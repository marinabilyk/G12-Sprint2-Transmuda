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

    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-')]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "//div[@data-name='recurrence-daily']//label/input[@value='1']")
    public WebElement valueRepeatEvery;

    @FindBy(xpath = "//div[@data-name='recurrence-daily']//span//span/span")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[contains(@title, 'event')]")
    public WebElement linkCreateCalendarEvent;

}
