Feature: Login functionality works properly

  @CNT-1199
Scenario: Checking login functionality with valid credentials
  Given user goes to login page
  When user enters valid "username" to the username box
  And user enters valid "password" to the password box
  And user clicks the log in button
  Then user should be navigate to main page

    @CNT-1224
    Scenario: User can not login with invalid password
      Given user goes to login page
      When user enters valid "username" to the username box
      And user enters invalid "password" to the password box
      And user clicks the log in button
      Then Verify that "Wrong login/password" message is displayed

      @CNT-1234
      Scenario: Verify that user got message if I leave empty any of credentials.
        Given user goes to login page
        When user enters valid "username" to the username box
        And user clicks the log in button
        Then user sees Please fill out this field message

      @CNT-1235
        Scenario Outline: Checking login functionality with valid credentials for salesmanagers
          Given user goes to login page
          When user enters valid "<username>" to the username box for salesmanagers
          And user enters valid "<password>" to the password box for salesmanagers
          And user clicks the log in button
          Then user should be navigate to main page

          Examples:
            | username                 | password     |
            | salesmanager10@info.com  | salesmanager |
            | salesmanager11@info.com  | salesmanager |
            | salesmanager12@info.com  | salesmanager |
            | salesmanager13@info.com  | salesmanager |
            | salesmanager14@info.com  | salesmanager |

     @CNT-1249
     Scenario: Verify that user got error message when user enter wrong credentials.
       Given user goes to login page
       When user enters invalid "username" to the username box
       And user enters invalid "password" to the password box
       And user clicks the log in button
       Then Verify that "Wrong login/password" message is displayed

       @CNT-1259
       Scenario: User land on the "reset password" page after clicking on the "Reset password" link
         Given user goes to login page
         When user clicks Reset Password link
         Then user sees Your Email  box

         @wip



