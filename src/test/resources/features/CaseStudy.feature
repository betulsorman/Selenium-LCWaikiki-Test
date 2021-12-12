Feature: Testinium CaseStudy Tests

  @regression
  Scenario: verify login, search result and add product to cart
    Then I verify opening homepage
    And I open signIn dropdown menu
    And I click signIn dropdown menu
    When fill login form for email "youremail@gmail.com"
    When fill login form for password "yourpassword"
    When sign in button clicked
    Then verify successful login
    When I search for "pantolan"
    And scroll end page
    And see more products
    And select random product
    And select size of product
    And product to cart
    And price in the product page
    And click my cart
    Then compare the price in the basket with the price on the product page
    And increase product
    Then verify increasing product
    And decrease product
    Then verify decreasing product