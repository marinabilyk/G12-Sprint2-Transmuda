@B34G12-142
Feature: Default

  @B34G12-141
  Scenario: US012AC1TC1  Filter names verifications as sales manager
    Given the user logged in as "sales manager"
    When User is on Accounts page
    Then User should be able to see filter name options below
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |

  @B34G12-148
  Scenario: US012AC1TC2 Filter names verifications as store manager
    Given the user logged in as "store manager"
    When User is on Accounts page
    Then User should be able to see filter name options below
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |