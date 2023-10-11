#Author: Jeby Jos
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
#@tag
Feature: Vet Management APIs


  @add_newvets
  Scenario Outline: Add new vet
    Given I have a new vet "<fname>" "<lname>"
    And I have the speciality "<specialityid>"
    When I add the new vet
    Then I verify the response code "201"

    Examples: 
      | fname  |	lname	| specialityid | 
      | Jeby	 |	Jos  |				2			 |
      | Elza	 |   Jos	|				3			 |	
      | Femi	 |   Joseph	|				1			 |