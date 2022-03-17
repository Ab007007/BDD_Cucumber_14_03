@datatable
Feature: Register multiple users

  # my scenario is starting
  Scenario: User Registration in Formy Application
    Given user launch formyApplication
    When user enter all the details and validate the success msg
      | firstname | lastname | jobtitle | education   | Sex  | yoe |
      | aravind   | HB       | Trainer  | Grad School | Male | 10+ |
      | aravind1  | HB2      | Trainer1 | Grad School | Male | 2-4 |
      | aravind2  | HB1      | Trainer2 | Grad School | Male | 5-9 |
    And close the browser
