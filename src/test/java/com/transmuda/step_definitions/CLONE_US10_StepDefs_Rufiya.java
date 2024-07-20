package com.transmuda.step_definitions;

import com.transmuda.pages.CalendarEventsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.devtools.v118.input.model.DragDataItem;

public class CLONE_US10_StepDefs_Rufiya {
    CalendarEventsPage calendarEventsPage=new CalendarEventsPage();

    @When("user navigate to Calendar event page")
    public void user_navigate_to_calendar_event_page() {

        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.navigateToModule("Activities","Calendar Events");
    }

    @When("user navigate to Create Calendar Event page")
    public void user_navigate_to_create_calendar_event_page() {

        BrowserUtils.waitForVisibility(calendarEventsPage.linkCreateCalendarEvent, 5);
        calendarEventsPage.linkCreateCalendarEvent.click();
    }

    @Then("user should be able to type {string} into Description field")
    public void user_should_be_able_to_type_into_description_field(String message) {

        Driver.getDriver().switchTo().frame(calendarEventsPage.iframeDescription);
        calendarEventsPage.descriptionInput.sendKeys(message);

        Assert.assertEquals(calendarEventsPage.descriptionInput.getText(), message);

        Driver.getDriver().switchTo().defaultContent();

    }
}
