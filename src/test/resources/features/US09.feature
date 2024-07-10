@calendar
Feature: Default

  Background:
		#@B34G12-144
    Given the user logged in as "sales manager"

  @B34G12-143
  Scenario Outline: US09AC01TC01 Verify user sees Error message when invalid integer is entered into Calendar Repeat every input box
    When User clicks Activities tab and Calendar Events module
    When User clicks on Create Calendar Event button
    When User clicks on Repeat button
    When User enters "<invalid number>" into Repeat Every input box user should see Error message
    Examples:
      | invalid number |
      |     -1         |
      |      100       |