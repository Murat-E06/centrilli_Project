Feature: Login functionality works properly

  @wip
Scenario: Checking login functionality with valid credentials
  Given user goes to login page
  When user enters valid "username" to the username box
  And user enters valid "password" to the password box
  And user clicks the log in button
  Then user should be navigate to main page