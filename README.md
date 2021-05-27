## Raindrops-Project
A simple exploratory project concerning input/output assurance and testing

## The general format for this project will be as follows:

1 - Initial commit comprising of project package structure, classes and requirements in gherkin format (using cucumber).

2 - Unit tests created for core functionality (TDD).

3 - Core functionality implemented.

4 - Unit tests expanded to cover more methods.

5 - StepDef files populated for gherkin BDD layer.

6 - Additional Terminal based GUI feature for user input. This step will not interfere with the other aspects of the project and is only meant as an experiment for additional functionality.

Ongoing - Iterative improvement of existing methods/functionality and implementation of additional methods/functionality as required.





# The task itself:

## Raindrops

Write a function that takes as its input a number (n) and converts it to a string, the contents of which depend on the numbers factors

- if the number has a factor of 3, output 'Pling'

- if the number has a factor of 5, output 'Plang'

- if the number has a factor of 7, output 'Plong'

- if the number does not have any of the above as a factor simply return the numbers digits

## Examples

- 28's factors are 1, 2, 4, 7, 14 and 28: this would be a simple 'Plong'

- 30's factors are 1, 2, 3, 5, 6, 10, 15, 30: this would be a 'PlingPlang'

- 34 has four factors: 1, 2, 17, and 34: this would be '34'




## Development Journal

Development has gone smoothly up to the 4th stage with only a few blips due to tiredness. Seems to be coming together nicely now!

A few changes were made during the implementation of the 5th stage, altering some assumptions about the functionality of the program based upon the examples given above. The new assumptions were that negative numbers are likely outside of the normal inputs (these examples all begin with the minimum value of 1), and that non-integer inputs would be invalid (doubles etc.). To this end, negative inputs return themselves and double-type inputs return a warning message regarding an invalid input.

With the development of this project coming to its end, I thought it would be interested to add a pseudo GUI to the application which can be run within an IDE's terminal. This GUI is entirely text-based and prompts the user for inputs. This version of the applicaation runs cyclically until the user terminates it with the correct response.
