#language: en
  Feature: Login saucelabs app

    Scenario: Login with valid credentials
      Given User wants to buy some clothes
      When User introduce the valid credentials standard_user secret_sauce
      And User selects the product
      Then User should see payment information