@B34G12-183
Feature: Default

	@B34G12-182
	Scenario Outline: CLONE_US10AC1TC1 Description functionality in Calendar Event Page
		Given the user logged in as "<userType>"
		    When user navigate to Calendar event page
		    And user navigate to Create Calendar Event page
		    Then user should be able to type "<message>" into Description field
		    Examples:
		      | userType      | message      |
		      | sales manager | test message |
		      | store manager | test message |
		      | driver        | test message |