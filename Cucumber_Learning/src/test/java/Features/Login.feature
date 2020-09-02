Feature: Login to StackOverflow Account
	Existing User should be able to login
	
Scenario: Login to account with valid credentials
   Given user Navigates to guru99 bank Website
   And User Enters Valid Username
   And User enters Valid Password
   When User clicks on Login Button
   Then User should be taken to successful login page