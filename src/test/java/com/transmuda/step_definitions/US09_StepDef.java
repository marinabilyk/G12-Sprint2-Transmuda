package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.CreateCalendarEventPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US09_StepDef extends BasePage{

    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();

    @When("User clicks Activities tab and Calendar Events module")
    public void user_clicks_activities_tab_and_calendar_events_module() {
        BrowserUtils.waitFor(1);
        activitiesTab.click();
        calendarEventsButton.click();
        BrowserUtils.waitFor(1);

    }
    @When("User clicks on Create Calendar Event button")
    public void user_clicks_on_create_calendar_event_button() {

        createCalendarEventPage.create_calendar_event_button.click();
        BrowserUtils.waitFor(2);
    }
    @When("User clicks on Repeat button")
    public void user_clicks_on_repeat_button() {
        BrowserUtils.waitFor(2);
        createCalendarEventPage.repeat_button.click();
        BrowserUtils.waitFor(2);
    }

    @When("User enters {string} into Repeat Every input box user should see Error message")
    public void userEntersIntoRepeatEveryInputBoxUserShouldSeeErrorMessage(String number) {
        int num = Integer.parseInt(number);

        createCalendarEventPage.repeatEveryButton.clear();

        createCalendarEventPage.repeatEveryButton.sendKeys(num + "");
        //createCalendarEventPage.repeat_button.sendKeys(number + Keys.ENTER);
        BrowserUtils.waitFor(2);

        if (num < 1){
            Assert.assertTrue(createCalendarEventPage.error_message.getText().contains("The value have not to be less than 1."));
            System.out.println("num < 1 : pass");
            BrowserUtils.waitFor(2);
        } else if (num > 99) {
            Assert.assertTrue(createCalendarEventPage.error_message.getText().contains("The value have not to be more than 99."));
            System.out.println("num > 99 : pass");
        }
        BrowserUtils.waitFor(2);
    }
}
