Feature: Login feature for Orange HRM application with DAta from Regular expression


  Scenario: This is Login scenario for Orange HRM with DAta from Regular expression
    Given User opens the Login page
    When User enters valid "Admin" and "admin123"
    And clicks on the login button
    Then user is navigated to home page
