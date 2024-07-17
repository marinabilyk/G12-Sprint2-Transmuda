package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCalendarEventPage extends BasePage {

    public CreateCalendarEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeat_button;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div[2]/div/div[1]/div[2]/div/fieldset/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/span/span/span")
    public WebElement error_message;

    @FindBy(xpath = "(//input[contains(@data-related-field,'interval')])[1]")
    public WebElement repeatEveryButton;

    @FindBy(id = "tinymce")
    public WebElement descriptionInputField;

    @FindBy(xpath = "//iframe[contains(@id, 'oro_calendar_event_form_description')]")
    public WebElement descriptionIframe;

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[allDay]']")
    public WebElement allDayEventCheckbox;

    @FindBy(name = "oro_calendar_event_form[use_hangout]")
    public WebElement callViaHangoutCheckbox;

    @FindBy(xpath = "//div[@class='recurrence-subview-control__item'][1]//input[1]")
    public WebElement repeatEveryRadioButton;

    @FindBy(xpath = "//span[contains(@id, 'temp-validation-name')]")
    public WebElement repeatEveryErrorMessage;

    @FindBy(name = "oro_calendar_event_form[title]")
    public WebElement titleField;

    @FindBy(xpath = "//span[contains(@class, 'simplecolorpicker')]/span[11]")
    public WebElement colorRed;

    @FindBy(xpath = "//span[contains(@class, 'simplecolorpicker')]/span[8]")
    public WebElement colorYellow;

    @FindBy(xpath = "//a[@class='btn add-list-item']")
    public WebElement reminders;

    @FindBy(name = "oro_calendar_event_form[reminders][1][method]")
    public WebElement remindersTypeDropdown;

    @FindBy(xpath = "//input[contains(@id, 'oro_calendar_event_form_reminders_1_interval_number')]")
    public WebElement remindersDurationField;

    @FindBy(xpath = "//input[contains(@id, ' oro_calendar_event_form_reminders_2_interval_unit')]")
    public WebElement remindersIntervalDropdown;



    public void clickOnCheckbox(String checkboxName) {
        switch (checkboxName.toLowerCase()) {
            case "all day event":
                allDayEventCheckbox.click();
                break;
            case "repeat":
                repeat_button.click();
                break;
            case "call via hangout":
                callViaHangoutCheckbox.click();
                break;
            default:
                System.out.println("Specify correct element name");
        }
    }

    public void selectRemindersValues(String type, int duration, String interval) {
        Select selectType = new Select(remindersTypeDropdown);
        if (type.equalsIgnoreCase("email")) {
            selectType.selectByValue("email");
        } else if (type.equalsIgnoreCase("flash message")) {
            selectType.selectByValue("web_socket");
        }
        remindersDurationField.sendKeys(duration + "");

        Select selectInterval = new Select(remindersIntervalDropdown);
        selectInterval.selectByValue("D");

    }

}
