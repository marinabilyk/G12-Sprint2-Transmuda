package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.CalendarEventsPage;
import com.transmuda.pages.CreateCalendarEventPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;


public class CLONE_US10_US08_StepDefs_MB extends BasePage {
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
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user clicks on {string} checkbox")
    public void user_clicks_on_checkbox(String checkboxName) {

        createCalendarEventPage.clickOnCheckbox(checkboxName);
    }

    @Then("user sees the number {int} by default in the Repeat Every input")
    public void user_sees_the_number_by_default_in_the_repeat_every_input(Integer num) {
        Assert.assertTrue("Repeat every radio button is not selected", createCalendarEventPage.repeatEveryRadioButton.isSelected());
        Assert.assertEquals("Default value is not 1", num + "", createCalendarEventPage.repeatEveryButton.getAttribute("value"));
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

    @And("user expands Reminders")
    public void userExpandsReminders() {
        createCalendarEventPage.reminders.click();
    }

    @And("user selects {string} type and {int} {string} interval")
    public void userSelectsTypeAndInterval(String type, int duration, String interval) {
        createCalendarEventPage.selectRemindersValues(type, duration, interval);
    }

    @And("user selects end {string} time and {string} date")
    public void userSelectsEndTimeAndDate(String time, String date) {
        createCalendarEventPage.endTime.clear();
        createCalendarEventPage.endTime.sendKeys(time);
        createCalendarEventPage.endDate.clear();
        createCalendarEventPage.endDate.sendKeys(date);
//        this step is to get rid of opened calendar view:
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(createCalendarEventPage.emptyBlock).click().perform();
        Assert.assertTrue("End time is not displayed", createCalendarEventPage.endTime.isDisplayed());
        Assert.assertTrue("End date is not displayed", createCalendarEventPage.endDate.isDisplayed());
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

    @And("user chooses Repeats {string}")
    public void userChoosesRepeats(String recurrence) {
        Select select = new Select(createCalendarEventPage.repeatsDropdown);
        select.selectByValue("daily");
    }

    @And("user chooses Ends after {int} occurrences")
    public void userChoosesEndsAfterOccurrences(int numOfOccurrences) {
        createCalendarEventPage.afterRadioBtnOfRepeat.click();
        createCalendarEventPage.afterOccurrencesInputOfRepeat.sendKeys(numOfOccurrences + "");
    }


    @And("user clicks Add Context Test Account \\(Account)")
    public void userClicksAddContextTestAccountAccount() {
        createCalendarEventPage.contextInput.click();
        BrowserUtils.sleep(2);
        createCalendarEventPage.testAccountContextSelect.click();
    }

    @And("user clicks Save And Close button")
    public void userClicksSaveAndCloseButton() {
        createCalendarEventPage.saveAndCloseBtn.click();
    }
    
    @Then("uses sees General Information container")
    public void usesSeesGeneralInformationContainer() {
        Assert.assertTrue("General info is not displayed" , calendarEventsPage.generalInformation.isDisplayed());
    }

    @And("user sees new event on Calendar Events page with {string} title")
    public void userSeesNewEventOnCalendarEventsPageWithTitle(String title) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        calendarEventsPage.showFiltersBtn.click();
        calendarEventsPage.titleFilter.click();
        calendarEventsPage.titleFilterInput.sendKeys(title + Keys.ENTER);
        BrowserUtils.sleep(2);
        wait.until(ExpectedConditions.visibilityOf(calendarEventsPage.newEvent));
        Assert.assertEquals("new event is not displayed", title, calendarEventsPage.newEvent.getText());
    }
}
