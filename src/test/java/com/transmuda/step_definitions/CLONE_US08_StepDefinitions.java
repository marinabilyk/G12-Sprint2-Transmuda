package com.transmuda.step_definitions;

import com.transmuda.pages.CalendarEventsPage;
import com.transmuda.pages.CreateCalendarEventPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CLONE_US08_StepDefinitions {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Given("user is on Calendar Event page")
    public void is_on_calendar_event_page() {

        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.navigateToModule("Activities","Calendar Events");
    }

    @When("User click to Create Calendar Event")
    public void user_click_to_create_calendar_event() {

        BrowserUtils.waitForVisibility(calendarEventsPage.linkCreateCalendarEvent, 5);
        calendarEventsPage.linkCreateCalendarEvent.click();

    }

    @When("Select Repeat checkbox")
    public void select_repeat_checkbox() {

        calendarEventsPage.repeatCheckbox.click();
    }

    @Then("User should see {string} in Repeat Every inputbox")
    public void user_should_see_in_repeat_every_inputbox(String value) {

        Assert.assertEquals(value, calendarEventsPage.valueRepeatEvery.getAttribute("value"));

    }

    @When("User leaves the Repeat Every field empty")
    public void user_leaves_the_repeat_every_field_empty() {

        calendarEventsPage.valueRepeatEvery.clear();
    }
    @Then("User should see {string} on the screen")
    public void user_should_see_on_the_screen(String message) {

        BrowserUtils.waitForVisibility(calendarEventsPage.errorMessage,5);
        Assert.assertEquals(message, calendarEventsPage.errorMessage.getText());

    }

}
