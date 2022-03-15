Feature: User Registration

Scenario: Successfull User Registration with valid values
Given User is on Registration Page
When User Enter first Name
And User Enter last Name
And User Enter jobtitile
When User click on Submit
Then User validate success message


Scenario: Successfull User Registration with Empty values
Given User is on Registration Page
When User click on Submit
Then User validate success message
