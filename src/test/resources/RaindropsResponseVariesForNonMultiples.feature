Feature: The application's response varies when the input is not a multiple of 3, 5 or 7

  Scenario: The Raindrops application receives an integer input which is not a multiple of 3, 5 or 7
    Given An Integer input of 11
    When The application is run
    Then The output should be "This input type is not supported"

  Scenario: The Raindrops application receives a non-integer input which is not a multiple of 3, 5 or 7
    Given A Double input of 11.42
    When The application is run
    Then The output should be "This input type is not supported"

  Scenario: The Raindrops application receives a string input, containing non-numerical characters
    Given An input of "Hello, I am an irritating input!"
    When The application is run
    Then The output should be "Please enter a valid input"

  Scenario: The Raindrops application receives an empty input
    Given An empty input
    When The application is run
    Then The output should be "Please enter a valid input"

  Scenario: The Raindrops application receives a null input
    Given A null input
    When The application is run
    Then The output should be "Please enter a valid input"

  Scenario: The Raindrops application receives a string input, equal to zero
    Given An input of "0"
    When The application is run
    Then The output should be an Integer: 0

    Scenario: The Raindrops application receives a string input, who's value is less than zero
      Given An input of "-6"
      When The application is run
      Then The output should be "-6"