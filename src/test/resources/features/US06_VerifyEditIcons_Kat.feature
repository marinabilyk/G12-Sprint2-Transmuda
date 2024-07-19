@B34G12-193
Feature: Default

		

	@B34G12-191
	Scenario Outline: Verify users can see edit car info icons from the Vehicle page
		Edit car info icons from Vehicle page
		
		Given the user logged in as "<userType>"
		When the user navigates to Fleet module
		And the user selects on Vehicles
		And user hovers the mouse over edit icons
		Then user sees edit info icons

		Examples:
		      | userType      |
		      | sales manager |
		      | store manager |
		      | driver        |