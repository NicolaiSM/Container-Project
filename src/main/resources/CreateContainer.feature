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
Feature: Create a new container

  @tag1
  Scenario: Successful creation of a new container
    Given a port of origin "Stockholm"
    And a list of valid ports ["Copenhagen", "Stockholm"]
    And a list of existing containers [id: "CON-12345678", port "Stockholm"; id:"CON-11223344", port "Copenhagen"]
    When creating a new container
    Then a new container has been added to the existing containers

  Scenario: Unsuccessful creation of a new container: the port
    Given a port of origin "Bern"
    And a list of valid ports ["Copenhagen", "Stockholm"]
    And a list of existing containers [id: "CON-12345678", port "Copenhagen"; id:"CON-11223344", port "Copenhagen"]
    When creating a new container
    Then the port was not a validport
    
    