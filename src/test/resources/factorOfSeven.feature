Feature: The input is a multiple of 7

  Scenario: The Raindrops application receives an integer, string, input which is a multiple of 7
    Given An input of 7
    When The application is run
    Then The output should be "Plong"

  Scenario: The Raindrops application receives a non-integer, string, input which is a multiple of 7
    Given An input of 7.00
    When The application is run
    Then The output should be "Plong"