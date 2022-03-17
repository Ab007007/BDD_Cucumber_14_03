@pom
Feature: Google Search

Scenario: Search fearture of google using POM
Given pom user is on google page
When pom user enter company name
Then google app display autosuggestions
And pom user pirnt all the suggestion 
And pom use close the browser