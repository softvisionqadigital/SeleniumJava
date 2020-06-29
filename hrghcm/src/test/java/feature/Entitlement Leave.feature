Feature: Entitling leave to employee

Scenario: Entitling leaves to user for required leave type
Given User is on Add Entitlements Leave page
When User enters the employee name in entitlement leave page
And selects the leave type which employee wants to get added
And selects the leave period
And enters the number of entitlement wants to assign
And clicks on save button
Then leave is entitled to employee successfully