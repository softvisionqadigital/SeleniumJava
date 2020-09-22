Feature: Login Action


@SmokeTest
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password as "john" and "pasw"
	Then Message displayed Login Successfully
	And the cards are displayed "true"
	
@SanityTest
Scenario: Successful login for another user
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password as "reky" and "pas2"
	Then Message displayed Login Successfully
	And the cards are displayed "false"

@SmokeTest
Scenario: Register user
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User Register to the website with the following data
	| Theju | theju@web.com | theju123 | Pasw123 |
	
	Then Message displayed Login Successfully

@RegressionTest	
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