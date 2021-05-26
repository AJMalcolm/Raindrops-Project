Feature: The input is a multiple of 3

  Scenario: The Raindrops application receives an integer, string, input which is a multiple of 3
    Given An Integer input of 3
    When The application is run
    Then The output should be "Pling"

  Scenario: The Raindrops application receives a non-integer, string, input which is a multiple of 3
    Given A Double input of 3.00
    When The application is run
    Then The output should be "Pling"