@SimpleLogin
Feature: SimpleLogin
@positive
  Scenario: Positive Scenario
    Given User is on the Login page
    When User enters the valid username and password
    And clicks the login button
    Then user should be navigated to home page

    @Negative
  Scenario: Negative Scenario
    Given User is on the Login page
    When User enters the valid username and password
    And clicks the login button
    Then user should be navigated to home page
    