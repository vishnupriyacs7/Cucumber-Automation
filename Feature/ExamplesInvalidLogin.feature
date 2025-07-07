Feature: Login Action 
Scenario Outline:  unSuccessful Login with InValid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters "<username>" and "<password>"
Then Login failed
Examples:
    		| username   			| password 			|
    		| locked_out_user | secret_sauce	|
    		| visual_user 		| abcd 					|

				
				