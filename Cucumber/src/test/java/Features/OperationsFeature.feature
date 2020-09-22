Feature: Operations Action


Background: User opens the browser
Given User is in the desktop
When user opens the broswer
Then User is in the search screen

@SanityTest @RegTest
Scenario: Successful login for another user
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password as "reky" and "pas2"
	Then Message displayed Login Successfully
	And the cards are displayed "false"
@SanityTest @RegTest
Scenario Outline: Login with multiple users
Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName as and Password as the "<username>" and "<password>"
	Then Message displayed Login Successfully
	
	Examples:
	| username | password |
	| Theju    | Pasw1    |
	| sree     | Pasw2    |
	| Arpi     | Pasw3    | 