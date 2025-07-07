Feature: Login Action 
Scenario Outline:  Successful Login with Valid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters "<username>" and "<password>"
Then Login Successful
Examples:
    		| username   | password |
    		| standard_user | secret_sauce |
    		| visual_user | secret_sauce |
				|	problem_user	|secret_sauce|
				
				