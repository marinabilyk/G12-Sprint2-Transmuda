@B34G12-147
Feature: Default

	Background:
		#@B34G12-158
		Given the user is on the login page
		
		

	@B34G12-145
	Scenario Outline: US04-TC01 Verify Store managers and Sales managers access the Vehicle contracts page
		Given the user logged in as "<userType>"
		Then the user navigates to Fleet module
		And user selects on Vehicle Contracts
		Then user sees expectedURL in the URL
		Then user sees expectedTitle is in the title

		Examples:
		|userType|
		|Sales Manager|
		|Store Manager|


	@B34G12-146
	Scenario: US04-TC02 Verify drivers should NOT able to access the Vehicle contracts page
		Given the user logged in as "driver" 
		And the user navigates to Fleet module
		Then user selects on Vehicle Contracts
		Then user sees error message on the screen