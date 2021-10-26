Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    Then user is navigated to the home page

    Examples:
      | username | password |
      | Admin   |    admin123 |

