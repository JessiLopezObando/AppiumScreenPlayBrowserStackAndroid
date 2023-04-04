Feature: Logout
  As: Swag Labs Mobile App user
  I want: To logout
  So that

  @Logout
  Scenario: Logout
    Given I logged in to the app
    When I am logging out
    Then I will see the login screen