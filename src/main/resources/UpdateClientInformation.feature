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
#""s
## (Comments)
#Sample Feature Definition Template


@tag
Feature: Update client information
Background: We assume that the we are already given an existing client. Which is in the system.

  @tag1
  Scenario: Successful update of client information
    Given a client with client name "Netto", address "Hindb�rsnittevej 23" and reference person " Jens B�rge" and email "Jens.B�rge@live.dk"
    And Client wants to update client name to "Ghetto Netto" 
    When Change previous client information to the given information
    Then Client has been updated
   