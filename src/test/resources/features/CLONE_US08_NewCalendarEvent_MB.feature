Feature: New calendar event

  Background:
    Given the user logged in as "store manager"
    When the user navigates to "Activities" tab and "Calendar Events" module
    And user navigates to Create Calendar Event page

  Scenario: User should see the number “1” by default in the Repeat Every input
    And user clicks on "Repeat" checkbox
    Then user sees the number 1 by default in the Repeat Every input

  Scenario: User should see an error message “This value should not be blank.” when the Calendar event repeat field is cleared
    And user clicks on "Repeat" checkbox
    And user deletes Repeat Every checkbox value
    Then user sees an error message below the checkbox

    Scenario: User is able to create a recurring event
      And user fills out Title "test title" on Create Calendar Event page
      And user is able to write "test" in description input field
      And user chooses "red" color
      And user expands Reminders
      And user selects "Flash message" type and 5 "days" interval
      And user selects end "3:00 PM" time and "Jul 27, 2027" date
      And user clicks on "all day event" checkbox
      And user clicks on "repeat" checkbox
      And user chosoes Repeats "Daily"
      And user chooses Ends after 5 occurrences
      And user clicks Add Context "Test Account (Account)"
      And user click Save And Close button
      Then uses sees General Information container
      And user sees new event on Calendar Events page

      


