Feature: Logout
  Yo como usuario de saucelabs
  Quiero tener la posibilidad de cerrar sesion
  Para salir de la aplicacion

  Scenario: Logout app
    Given el usuario inicia sesion exitosamente en la app
    When el usuario solicita cerrar sesion
    Then