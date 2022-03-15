Feature: Google Search Box

Scenario: Disaplay Auto suggestions for IBM
Given user is on google page
When user enter "IBM" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions


Scenario: Disaplay Auto suggestions for WIPRO
Given user is on google page
When user enter "WIPRO" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions

Scenario: Disaplay Auto suggestions for Infosys
Given user is on google page
When user enter "Infosys" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions


Scenario: Disaplay Auto suggestions for JUNKTEXT
Given user is on google page
When user enter "Infosysasdfasfasdfasdfasdfasdfasfd" in search box
Then user should get suggestion based on search criteria
And user will print the suggestion

Scenario: Disaplay Suggestions for synechron Search
Given user is on google page
When user enter "synechron" in search box
And click on serach button
And application will display no result


Scenario: Disaplay Suggestions for synechron Search
Given user is on google page
When user enter "synechron" in search box
And click on serach button
And application will display more result