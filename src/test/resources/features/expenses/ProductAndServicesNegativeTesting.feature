@regression

Feature: Products and Services (Expense) Functionality (Negative Test)

  Scenario: Adding empty information in a Product and Service

    Given the user provides valid credentials and clicks the Sign In button
    Then the user is navigated to the Infographics page and validates the company name
    When the user clicks the Expenses dropdown and selects the Products and Services option
    And the user is navigated to the Products and Services page
    And the user validates and verifies the title "Products and Services (Expense)"
    And the user clicks Add Product and Services
    And the user clicks the Save button without filling in the required fields (name, price, service type, category, description, date)
    Then the user validates that appropriate error messages are displayed for each required field


