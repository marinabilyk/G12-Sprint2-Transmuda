package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage extends BasePage{

    public CreateCalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeat_button;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div[2]/div/div[1]/div[2]/div/fieldset/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/span/span/span")
    public WebElement error_message;

    @FindBy(xpath = "(//input[contains(@data-related-field,'interval')])[1]")
    public WebElement repeatEveryButton;


}
