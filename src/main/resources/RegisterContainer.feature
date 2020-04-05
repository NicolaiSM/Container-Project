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
Feature: Register Container (Actor: Client) 

	Scenario: Successful registration of a container
    Given A new port of origin "Stockholm"
    And A List of all valid ports ["Stockholm", "Copenhagen"] which is in the system
    And A new destination "Copenhagen"
    And A client with client ID "CLI-12345678" which is in the system
    And "Milk" as content of the container
    And A container in-port "Stockholm" and with container ID "CON-11111111"
    And The status of the container is "not in route"
	  When Registering a container
    Then Change container status to "in-route"

