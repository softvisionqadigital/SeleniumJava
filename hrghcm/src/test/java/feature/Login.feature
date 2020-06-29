Feature: Orange HRM Application Login

@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User login with Username "Admin" and password "admin123"
Then Dashboard page is displayed
