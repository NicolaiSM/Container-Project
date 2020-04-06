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
Feature: Register Client
	
  @tag1
  Scenario: Succesful registration of client
    Given a new client name "Netto", address "Langesvej 2, 4600 Køge", contactperson with name "David Bo", email of contactperson "DB@netto.com"
    And a list of clients with attributes name: "Xlbyg", address: "Englandsvej 102, 2300 København", Contactperson name "Rasmus Seebach", Contactperson email "RB@xlbyg.com" and name: "NovaNordisk", address: "Englandsvej 103, 2300 København", Contactperson name: "Thomas Dhal", Contactperson email: "TD@NN.com"
    And new client name dosent exist
    When registering a new client
    Then Client is registered
  
  @tag1
  Scenario: Unsuccesful registration of client because client name is already in use
   	Given a new client name "Xlbyg", address "Englandsvej 102, 2300 København", contactperson with name "Rasmus Seebach", email of contactperson "RB@xlbyg.com"
    And a list of clients with attributes name: "Xlbyg", address: "Englandsvej 102, 2300 København", Contactperson name "Rasmus Seebach", Contactperson email "RB@xlbyg.com" and name: "NovaNordisk", address: "Englandsvej 103, 2300 København", Contactperson name: "Thomas Dhal", Contactperson email: "TD@NN.com"
    And new client name do exist
    When registering a new client
    Then Client is not registered



