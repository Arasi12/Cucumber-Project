@DataDriven @SimpleLogin
Feature: Login feature Date table with Example
Scenario Outline: This is Login scenario using Date table with Example
  
Given User enters url of Login page1
When user enter valid "<username>" and "<password>"
And selects the login button1

Examples:
|username|password|
|Admin	 |admin123|
#|abc|abc|
#|wwwww|wwwwwwww|
