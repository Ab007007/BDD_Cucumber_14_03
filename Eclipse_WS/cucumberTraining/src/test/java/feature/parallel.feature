@parallel
Feature: Google Search Box

Background:
Given user is on google page


@development @uat @google
Scenario: Disaplay Auto suggestions for IBM
When user enter "IBM" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions

@google
Scenario: Disaplay Auto suggestions for WIPRO
When user enter "WIPRO" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions

@regression
Scenario: Disaplay Auto suggestions for Infosys
When user enter "Infosys" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions


Scenario: Disaplay Auto suggestions for JUNKTEXT
When user enter "Infosysasdfasfasdfasdfasdfasdfasfd" in search box
Then user should get suggestion based on search criteria
And user will print the suggestion

Scenario: Disaplay Suggestions for synechron Search
When user enter "synechron" in search box
And click on serach button
And application will display no result


Scenario: Disaplay Suggestions for synechron Search
When user enter "synechron" in search box
And click on serach button
And application will display more result