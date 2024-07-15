@B34G12-163
Feature: Default


  @B34G12-161
  Scenario Outline: CLONE_US08AC1TC1 Default Repeat Value In Calendar Event
    Given the user logged in as "<userType>"
    Given "<userType>" is on Calendar Event page
    When User click to Create Calendar Event
    And Select Repeat checkbox
    Then User should see "<defaultValue>" in Repeat Every inputbox
    Examples:
      | userType      | defaultValue |
      | store manager | 1            |
      | driver        | 1            |
      | sales manager | 1            |


  @B34G12-162
  Scenario Outline: CLONE_US08AC2TC1  Error Message for Calendar Even Repeat Field
    Given "<userType>" is on Calendar Event page
    When User click to Create Calendar Event
    And Select Repeat checkbox
    And User leaves the Repeat Every field empty
    Then User should see "<errorMessage>" on the screen

    Examples:
      | userType      | errorMessage                   |
      | driver        | This value should not be blank |
      | sales manager | This value should not be blank |
      | store manager | This value should not be blank |
