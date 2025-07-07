Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    Then I should be logged in successfully

  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter invalid username and password
    Then I should see an error message

