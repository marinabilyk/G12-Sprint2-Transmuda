Feature: Ability to type in Description input field of Create Calendar Event page

  Scenario Outline: Write message in the Description ** field
    Given the user logged in as "<user>"
    When the user navigates to "Activities" tab and "Calendar Events" module
    And user navigates to Create Calendar Event page
    Then user is able to write "message test" in description input field
    Examples:
      | user          |
      | driver        |
      | store manager |
      | sales manager |