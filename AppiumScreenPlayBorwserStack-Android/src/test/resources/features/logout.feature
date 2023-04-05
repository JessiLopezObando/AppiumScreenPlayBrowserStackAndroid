#language: en
Feature: login and logout in saucelabs app

  AS
  user
  I WANT TO
  logout in saucelabs app
  SO THAT
  see login

  Scenario: Logout
    Given El usuario esta en la pagina de inicio
    And envia datos para  iniciar sesion "standard_user" y "secret_sauce"
    When Usuario cierra sesion
    Then Usuario vuelve al inicio sesion