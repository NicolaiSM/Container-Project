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
Feature: find clients based one or more of it attributes 

	Background: attributes is contactperson firstname, contacperson lastname, contactperson email, client adress and client name

  @tag1
  Scenario: one or more cleints found matching one attribute 
    Given a given a name for a client "Xlbyg"
    And a list of clients with attributes name: "Xlbyg", address: "Englandsvej 102, 2300 København", Contactperson name "Rasmus Seebach", Contactperson email "RB@xlbyg.com" and name: "NovaNordisk", address: "Englandsvej 103, 2300 København", Contactperson name: "Thomas Dhal", Contactperson email: "TD@NN.com"
    When Finding clients that matches keyword
    Then Check if any result is found
	
	@tag1
	Scenario: no clients found that matching one keyword
		Given a given a name for a client "Topsil"
    And a list of clients with attributes name: "Xlbyg", address: "Englandsvej 102, 2300 København", Contactperson name "Rasmus Seebach", Contactperson email "RB@xlbyg.com" and name: "NovaNordisk", address: "Englandsvej 103, 2300 København", Contactperson name: "Thomas Dhal", Contactperson email: "TD@NN.com"
    When Finding clients that matches keyword
    Then Check that no result is found
    
	Scenario: one or more cleints found matching two keywords
		Given a name for a client "Xlbyg" and a contactperson name "Rasmus Seebach"
    And a list of clients with attributes name: "Xlbyg", address: "Englandsvej 102, 2300 København", Contactperson name "Rasmus Seebach", Contactperson email "RB@xlbyg.com" and name: "NovaNordisk", address: "Englandsvej 103, 2300 København", Contactperson name: "Thomas Dhal", Contactperson email: "TD@NN.com"
    When Finding clients that matches keyword
    Then Check if any result is found
		
	Scenario: no clients found matching two keywords
		Given a name for a client "Topsil" and a contactperson name "Julius Ceaser"
    And a list of clients with attributes name: "Xlbyg", address: "Englandsvej 102, 2300 København", Contactperson name "Rasmus Seebach", Contactperson email "RB@xlbyg.com" and name: "NovaNordisk", address: "Englandsvej 103, 2300 København", Contactperson name: "Thomas Dhal", Contactperson email: "TD@NN.com"
    When Finding clients that matches keyword
    Then Check that no result is found
		