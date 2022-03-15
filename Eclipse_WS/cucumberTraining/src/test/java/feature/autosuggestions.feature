Feature: Google Search Box

Scenario: Disaplay Auto suggestions for synechron
Given user is on google page
When user enter synechron in search box
Then user should get suggestions based on search criteria
And user will print the suggestions


Scenario: Disaplay Suggestions for synechron Search
Given user is on google page
When user enter synechron in search box
And click on serach button
And user will first page search results
