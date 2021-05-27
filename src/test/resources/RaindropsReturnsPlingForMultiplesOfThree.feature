Feature: The program returns Pling for input multiples of 3

  Scenario: The Raindrops application receives an integer, string, input which is a multiple of 3
    Given An input of "3"
    When The application is run
    Then The output should be "Pling"