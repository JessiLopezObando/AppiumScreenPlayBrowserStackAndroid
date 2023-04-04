#language: en
  Feature: buy saucelabs app

    AS
    user
    I WANT TO
    choose product
    SO THAT
    buy product

    Scenario: Login with valid credentials
      Given User wants to buy some clothes
      When User introduce the valid credentials standard_user secret_sauce
      And User selects the product
      Then User should see payment information