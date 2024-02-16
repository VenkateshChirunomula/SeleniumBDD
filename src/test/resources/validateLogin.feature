Feature: validate login functionality of the application
  @Login
  Scenario: valid username and password
    Then user enters username
    Then user enters password
    When user clicks on signin button
#    Then i validate user login
#
#
#    #Hooks - > before after beforestep afterstep
#
#
#    #class name should be Hooks
#  @Login
#  Scenario: invalid username and password
#    Then user enters username
#    Then user enters password
#    When user clicks on signin button
#    Then i validate user login