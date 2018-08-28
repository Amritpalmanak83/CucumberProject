#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Platform smoke test

  @tag1
  Scenario: Test login with Valid credientials
    Given Open the ChromeBrowser and start Platform
    When I enter "Host" and "dnnhost"
    And click Login button
    Then Check User able to loginName to Platform or not "SuperUser Account"

  @tag2
  Scenario: Test login with InValid credientials
    Given Open the ChromeBrowser and start Platform
    When I enter "InvalidUser" and "InValidPass"
    And click Login button
    Then Check User able to loginName to Platform or not "InvalidUser"
    
   @tag3
   Scenario: Test Error message and take a Screenshot
	   Given Open the ChromeBrowser and start Platform
	   When I enter "host" and "dnnhost" 
	   And click Login button
	   Then Check error message and capture screenshot "tag3"
	   
   
   
    
    