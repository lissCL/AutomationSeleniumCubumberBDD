Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid credentials
    Then user is navigated to the home page



