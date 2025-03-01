Feature: Demo how to upload json report to xray

  Background: this is for navigation Docuport login page
    Given user is on Docuport login page

  @xray @smoke
  Scenario: Login as a client
    When user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user click login button
    Then user should be able to see the home for client