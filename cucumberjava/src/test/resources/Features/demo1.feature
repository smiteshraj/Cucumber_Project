Feature: feature to test login functionality.


Scenario: check login is successful with login credentials.

Given user is on login page.
When  user enters username and password.
And clicks on login button.
Then user is navigated to home page.
 