Feature: This to test Google search
Scenario: Google search scenario
	Given user is entering google.in
	When user is typing search term "Arya Stark"
	And enters the return key
	Then The user should see search result