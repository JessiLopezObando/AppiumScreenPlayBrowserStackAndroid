Feature: Buy a product
  As: Swag Labs Mobile App user
  I want: To buy a product
  So that

  @Buy
  Scenario: Buy backpack
    Given I logged in
    When I select Sauce Labs Backpack
    And I pay for it
    Then I will see a message thanking for order