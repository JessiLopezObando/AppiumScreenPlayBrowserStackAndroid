#language: en
Feature: login y logout en saucelabs app

  AS
  usuario
  I WANT TO
  logout con exito saucelabs app
  SO THAT
  volver a la página de login

  Scenario: Logout
    Given El usuario esta en la pagina de inicio
    And envia datos para  iniciar sesion "standard_user" y "secret_sauce"
    When Usuario cierra sesion
    Then Usuario vuelve al inicio sesion