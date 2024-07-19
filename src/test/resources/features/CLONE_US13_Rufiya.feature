@B34G12-187
Feature: Default

  @B34G12-185
  Scenario Outline: CLONE_US13AC1TC1 Verify user can see columns on the Vehicle Model page.
    Given the user logged in as "<userType>"
    When user navigates to "Fleet" tab and "Vehicle Costs" module
    Then user should be able to see below options
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      | userType      |
      | store manager |
      | sales manager |

  @B34G12-186
  Scenario Outline: CLONE_US13AC2TC1 Verify that user can select all Vehicle Costs
    Given the user logged in as "<userType>"
    When user navigates to "Fleet" tab and "Vehicle Costs" module
    Then user should be able to check first checkbox to select All Vehicle Costs

    Examples:
      | userType      |
      | sales manager |
      | store manager |