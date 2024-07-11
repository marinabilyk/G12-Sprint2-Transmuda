Feature: Marketing page filters

  Scenario Outline: Store and sales managers should see all 5 filter options are checked by default
    Given the user logged in as "<userType>"
    When user navigates to Campaigns page MB
    And user clicks on Filters button MB
    And user clicks on Manage filters drop down MB
    Then user sees all filter options are checked by default MB
      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |

    Examples:
      | userType      |
      | store manager |
      | sales manager |
