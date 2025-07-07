Feature: Calculator
Scenario: Add two numbers
Given Following numbers
			|Number1|Number2|
			|		5		|  3    |
			|		2		|  2    |
When Add them
Then The result should be 8
