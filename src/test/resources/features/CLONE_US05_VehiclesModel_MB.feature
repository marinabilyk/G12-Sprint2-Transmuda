@B34G12-172
Feature: Vehicles Model

  @B34G12-170
  Scenario Outline: Store and sales managers see 10 columns
    Given the user logged in as "<userType>"
    When the user navigates to "Fleet" tab and "Vehicles Model" module
    Then user sees columns below
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | userType      |
      | sales manager |
      | store manager |

  @B34G12-171
  Scenario: Drivers sees error message “You do not have permission to perform this action.” once accessing Vehicle Model page
    Given the user logged in as "driver"
    When the user navigates to "Fleet" tab and "Vehicles Model" module
    Then user sees "You do not have permission to perform this action." error message