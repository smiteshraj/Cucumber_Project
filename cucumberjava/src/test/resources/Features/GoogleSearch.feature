

Feature: feature to search google search functionality.

Scenario: Validate google search is working.

Given broser is launched 
And user is on google page 

When user enters text in search box 
And hits enter 
Then user is navigated to test results 

