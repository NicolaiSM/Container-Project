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

  @tag1
  Scenario: Successful update of client information
    Given a database of clients with attributes name: "Netto", address: "Hindbearsnittevej 23", contactperson name " Jens Bearge", contactperson email "Jens.Bearge@live.dk" and name: "NovaNordisk", address: "Englandsvej 103, 2300 København", contactperson name: "Thomas Dhal", contactperson email: "TD@NN.com"
    When the logistic company change the client name  "Netto" to "Ghetto Netto" 
    Then Client has been updated
    
   Scenario: Unsuccessful update of client information
   	Given a database of clients with attributes name: "Netto", address: "Hindbearsnittevej 23", contactperson name " Jens Bearge", contactperson email "Jens.Bearge@live.dk" and name: "Ghetto Netto", address: "Englandsvej 103, 2300 København", contactperson name: "Thomas Dhal", contactperson email: "TD@NN.com"
    When the logistic company change the client name  "Netto" to "Ghetto Netto" 
    Then Client have not been updated
   