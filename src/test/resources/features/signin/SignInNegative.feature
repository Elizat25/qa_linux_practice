
@regression
Feature: Testing Sign In Functionality

  Scenario Outline: Testing Negative Sign In (with invalid credentials)
    Given the user is on the Cashwise login page and clicks the Sign In button.
    When User provides   '<email>' and  '<password>'
    And User  clicks the Sign In button
    Then User validates the '<expectedMessage>'


    Examples:
      | email                 | password  | expectedMessage                        |
      | dossimovaib@gmail     | Indira123 | Please enter a valid email address     |
      | dossimovaib@gmail.com | Ind       | Password must be at least 6 characters |
