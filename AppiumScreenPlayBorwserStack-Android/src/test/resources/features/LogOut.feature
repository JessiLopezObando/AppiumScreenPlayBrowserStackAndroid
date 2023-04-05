#language: en
Feature: el usuario cierra sesion en la app saucelabs
  Yo como usuario de la app saucelabs
  Quiero navegar en la app realizar compra y cerrar sesion
  Para que no me quede la cuenta abierta

  Scenario Outline: Cerrar sesion exitosa
    Given El usuario se encuentra en la pagina de incio
    When El usuario introduce las credenciales usuario <usuario> contrasenia <contrasenia>
    And realiza las compras de su interes y cierra sesion
    Then El usuario deberia volver al inicio de la app
    Examples:
      | usuario         | contrasenia    |
      | "standard_user" | "secret_sauce" |