package com.transmuda.step_definitions;

import com.transmuda.pages.CalendarEventsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.sql.rowset.BaseRowSet;

public class US08_StepDefinitions {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Given("{string} is on Calendar Event page")
    public void is_on_calendar_event_page(String userType) {

        calendarEventsPage.navigateToModule("Activities","Calendar Events");
    }

    @When("User click to Create Calendar Event")
    public void user_click_to_create_calendar_event() {

        BrowserUtils.waitForVisibility(calendarEventsPage.calendarEvent, 5);
        calendarEventsPage.calendarEvent.click();

    }

    @When("Select Repeat checkbox")
    public void select_repeat_checkbox() {


    }
    @Then("User should see {string} in Repeat Every inputbox")
    public void user_should_see_in_repeat_every_inputbox(String string) {


    }

    @When("User leaves the Repeat Every field empty")
    public void user_leaves_the_repeat_every_field_empty() {


    }
    @Then("User should see {string} on the screen")
    public void user_should_see_on_the_screen(String string) {


    }

}
