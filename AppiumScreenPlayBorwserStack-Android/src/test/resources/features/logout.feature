#language: en
Feature: buy saucelabs app

  AS
  user
  I WANT TO
  choose product
  SO THAT
  buy product

  Scenario: Logout
    Given El usuario esta en la pagina de inicio
    And envia datos para  iniciar sesion "standard_user" y "secret_sauce"
    When Usuario cierra sesion
    Then Usuario vuelve al inicio sesion