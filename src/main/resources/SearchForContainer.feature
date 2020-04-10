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
Feature: Search for a container by a keyword

  @tag1
  Scenario: Successful search for a container
    Given a keyword "Cheese"
    And a database of existing containers port: "Oslo", port of origin: "Helsinki", destination: "London," content: "Cheese", company: "Netto"
    When searching for a container
    Then a container has been found
	Scenario: Unsuccessful search: no container matches input
		Given: a keyword "Cheese"
		And a database of existing containers port: "Oslo", port of origin: "Helsinki", destination: "London," content: "Bacon", company: "Netto"
		When searching for a container
		Then the keyword does not match any container
		