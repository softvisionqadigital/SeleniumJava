Feature: Assigning Leave to employee

Scenario: Assigning leave when user has no leave balance
Given User is on Assign Leave page
When User enters the employee name
And enters the leave type which employee is availing
And gets the leave balance for selected leave type
And User calls the entitlement leave function to entitle the leave
And User navigates back to Assign Leave page and enters the employee name
And enters the leave type which employee is availing
And selects the date on which employee wants leave
And enters the requisite comment
And clicks on Assign button 
Then leave is assign to employee successfully and remaining leaves is updated

Scenario: Assigning leave when user has positive leave balance
Given User is on Assign Leave page
When User enters the employee name
And enters the leave type which employee is availing
And selects the date on which employee wants leave
And enters the requisite comment
And clicks on Assign button 
Then leave is assign to employee successfully
And remaining leaves for leave type is updated
