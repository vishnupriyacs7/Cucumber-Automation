Feature: Login

Scenario: Valid login
Given user on login page
When user enters valid username and password
Then user logs in

Scenario: Invalid login
Given user on login page
When user enters invalid username and password
Then unsuccessful login