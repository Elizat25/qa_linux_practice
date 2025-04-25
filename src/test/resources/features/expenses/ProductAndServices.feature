@regression
Feature: Products and Services (Expense) Functionality

  Scenario: Adding and Validating a Product or Service

    Given the user provides valid credentials and clicks the Sign In button
    Then the user is navigated to the Infographics page and validates the company name
    When the user clicks the Expenses dropdown and selects the Products and Services option
    And the user is navigated to the Products and Services page
    And the user validates and verifies the title 'Products and Services (Expense)'
    And the user clicks Add Product and Services
    And the user provides the following information:name,price,service type,category,description,date
    And the user selects a Remind Before opt ion and clicks the Not Repeat box
    And the user clicks the Save button
    Then the user validates that all entered information is correctly displayed in the Products and Services tab
    And the user deletes all information and validates that the list is empty
