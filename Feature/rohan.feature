Feature: Calculator
Scenario Outline: Add two Number
Given I Have a calculator
When I add <num1> and <num2>
Then The result should be <result>
   
   Examples:
   |num1|num2 |result|
   |3		|7		|10    |
   |5		|5		|10		 |
   |6		|4		|10    |

