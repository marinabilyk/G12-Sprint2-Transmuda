Feature: Default

	Background:
		#@B34G12-144
		Given the user logged in as "<userType>"
		

	
	@B34G12-166
	Scenario: TC01_CLONE - US07_Verify user can select any car on Vehicles page
		When User clicks Fleet tab
		And User chooses Vehicles link
		And User sees all unchecked checkboxes
		And User clicks on first checkbox to check all the cars
		And User unchecks first checkbox
		Then User selects a random car