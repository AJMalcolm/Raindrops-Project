Feature:  The program returns Plang for input multiples of 5

  Scenario: The Raindrops application receives an integer, string, input which is a multiple of 5
    Given An Integer input of 5
    When The application is run
    Then The output should be "Plang"

  Scenario: The Raindrops application receives a non-integer, string, input which is a multiple of 5
    Given A Double input of 5.00
    When The application is run
    Then The output should be "Plang"