Feature: Pets APIs

      
    @add_newpet
    Scenario: Add a new pet
    Given I have owner details for "Franklin" 
    And I have pet category for "cat"
    When I add a new pet "Filli" with birthday "2020-09-17"
    Then the response code should be "201"