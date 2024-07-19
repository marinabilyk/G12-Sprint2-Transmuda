@B34G12-193
Feature: Default

		

	@B34G12-191
	Scenario Outline:
		
		Given the user logged in as "<userType>"
		When the user navigates to Fleet module
		And the user selects on Vehicles
		Then user hovers the mouse over three dots and see edit info icons

		Examples:
		      | userType      |
		      | sales manager |
		      | store manager |
		      | driver        |