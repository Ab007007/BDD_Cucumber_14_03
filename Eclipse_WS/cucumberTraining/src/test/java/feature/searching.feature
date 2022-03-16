Feature: Multiple Search in google

  Scenario Outline: Google Multiple Search
    Given user is on google page
    When user enter <company> in search box
    And click on serach button
    Then user will printall the hyperlinks
    And click on first link

    Examples: 
      | company   |
      | IBM       |
      | WIPRO     |
      | SYNECHRON |