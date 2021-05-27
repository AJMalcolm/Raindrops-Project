Feature: The program returns Plong for input multiples of 7

  Scenario: The Raindrops application receives an integer, string, input which is a multiple of 7
    Given An input of "7"
    When The application is run
    Then The output should be "Plong"