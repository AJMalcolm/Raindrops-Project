Feature: The input is not a multiple of 3, 5 or 7

  Scenario: The Raindrops application receives an integer input which is not a multiple of 3, 5 or 7
    Given An input of 11
    When The application is run
    Then The output should be 11

  Scenario: The Raindrops application receives a non-integer input which is not a multiple of 3, 5 or 7
    Given An input of 11.42
    When The application is run
    Then The output should be 11.42

  Scenario: The Raindrops application receives a string input, containing non-numerical characters
    Given An input of "Hello, I am an irritating input!"
    When The application is run
    Then The output should be "Please enter a valid input"

  Scenario: The Raindrops application receives an empty or null input
    Given An empty or null input
    When The application is run
    Then The output should be "Please enter a valid input"