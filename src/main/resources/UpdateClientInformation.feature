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

Background: We assume that the we are already given an existing client. Which is in the system.

@tag
Feature: Update client information

  @tag1
  Scenario: Successful update of client information
    Given a client with client ID "CLI-11111111" , client name "Netto", address "Hindbærsnittevej 23" and reference person " Jens Bï¿½rge" and email "Jens.Bï¿½rge@live.dk"
    And Client wants to update client name to "Ghetto Netto" 
    When Change previous client information to the given information
    Then Client has been updated
    
  Scenario: Unsuccesful