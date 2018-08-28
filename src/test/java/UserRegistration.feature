Feature: User can be register in Platform

  Background: 
    Given Open the ChromeBrowser and enter registration link

  Scenario: register single user in Platform
    When User enter "UserName12", "Password12" ,"Password12", "DisplayName12" and "EmailAddress@dnn.com"
    And Click Register button
    Then User Registration message should display

  Scenario Outline: register multiple user in Platform
    When User enter "<UserName>", "<Password>" ,"<ConfirmPassword>", "<DisplayName>" and "<EmailAddress>"
    And Click Register button
    Then User Registration message should display

    Examples: 
      | UserName | Password | ConfirmPassword | DisplayName | EmailAddress       |
      | Test110   | dnnhost1 | dnnhost1        | TestUser110  | TestUser110@dnn.com |
      | Test211   | dnnhost2 | dnnhost2        | TestUser211  | TestUser211@dnn.com |
      | Test311   | dnnhost3 | dnnhost3        | TestUser311  | TestUser311@dnn.com |

  Scenario: exisitng user cannot be register
    When User enter "Test1", "dnnhost" ,"dnnhost1", "TestUser1" and "TestUser1@dnn.com"
    And Click Register button
    Then User Registration failed and show error message on page
