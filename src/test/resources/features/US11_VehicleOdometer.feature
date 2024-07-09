@B34G12-136
Feature: Default

  Background:
		#@B34G12-132
    Given user is on the login page


  @B34G12-133
  Scenario Outline: US11AC1 Sales and Store manager error message verification
    Given user is logged in as "<userType>"
    When user is on "<pageSubtitle>"
    And user hover over Fleet
    And user Selects Vehicle odometer
    Then user should see error message on screen

    Examples:
      | userType     | pageSubtitle |
      | salesManager | Dashboard    |
      | storeManager | Dashboard    |


  @B34G12-134
  Scenario: US11AC2 Driver default page verification
    Given user is logged in as Driver
    When user is on dashboard
    And user hover over Fleet
    And user Selects Vehicle odometer
    Then user should see default page as 1


  @B34G12-135
  Scenario: US11AC3 Driver view per page verification
    Given user is logged in as Driver
    When user is on dashboard
    And user hover over Fleet
    And user Selects Vehicle odometer
    Then user should see view per page 25 by default.