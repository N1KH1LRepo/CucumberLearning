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
Feature: User successfully creates LinkedIn Account

  @web
  Scenario Outline: Validate Registration field
    Given User on LinkedIn
    When I enter user as "Alex" and password as "Alex1234
    And fulfilled all required registration information
    And I submit login page
    Then confiormation email is sent

    Examples: 
      | uname  | pass  		|
      | Alex	 | Alex1234 |
      | admin  | admin    |
