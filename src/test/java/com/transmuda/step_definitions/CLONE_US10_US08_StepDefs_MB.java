package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.CalendarEventsPage;
import com.transmuda.pages.CreateCalendarEventPage;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CLONE_US10_US08_StepDefs_MB extends BasePage {
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
    Select select;

    @When("user navigates to Create Calendar Event page")
    public void user_navigates_to_create_calendar_event_page() {
        waitUntilLoaderScreenDisappear();
        calendarEventsPage.linkCreateCalendarEvent.click();
    }

    @Then("user is able to write {string} in description input field")
    public void user_is_able_to_write_in_description_input_field(String message) {

        Driver.getDriver().switchTo().frame(createCalendarEventPage.descriptionIframe);
        createCalendarEventPage.descriptionInputField.sendKeys(message);
        Assert.assertEquals(createCalendarEventPage.descriptionInputField.getText(), message);
    }

    @When("user clicks on {string} checkbox")
    public void user_clicks_on_checkbox(String checkboxName) {

        createCalendarEventPage.clickOnCheckbox(checkboxName);
    }

    @Then("user sees the number {int} by default in the Repeat Every input")
    public void user_sees_the_number_by_default_in_the_repeat_every_input(Integer int1) {
        Assert.assertTrue("Repeat every radio button is not selected", createCalendarEventPage.repeatEveryRadioButton.isSelected());
        Assert.assertEquals("Default value is not 1", "1", createCalendarEventPage.repeatEveryButton.getAttribute("value"));
    }

    @When("user deletes Repeat Every checkbox value")
    public void user_deletes_repeat_every_checkbox_value() {
        createCalendarEventPage.repeatEveryButton.clear();
    }

    @Then("user sees an error message below the checkbox")
    public void user_sees_an_error_message_below_the_checkbox() {
        Assert.assertTrue("Error message is not displayed", createCalendarEventPage.repeatEveryErrorMessage.isDisplayed());
    }

    @And("user fills out Title {string} on Create Calendar Event page")
    public void userFillsOutTitleOnCreateCalendarEventPage(String title) {
        createCalendarEventPage.titleField.sendKeys(title);
    }

    @And("user chooses {string} color")
    public void userChoosesColor(String color) {
        switch (color.toLowerCase()) {
            case "red":
                createCalendarEventPage.colorRed.click();
                break;
            case "yellow":
                createCalendarEventPage.colorYellow.click();
                break;
            default:
                System.out.println("Chose red or yellow color");
        }
    }


    @And("user expands Reminders")
    public void userExpandsReminders() {
        createCalendarEventPage.reminders.click();
    }

    @And("user selects {string} type and {int} {string} interval")
    public void userSelectsTypeAndInterval(String type, int duration, String interval) {
        createCalendarEventPage.selectRemindersValues(type, duration, interval);
    }


}
