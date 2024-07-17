package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.CalendarEventsPage;
import com.transmuda.pages.CreateCalendarEventPage;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CLONE_US10_StepDefs_MB extends BasePage {
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();

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
}
