Feature: Logout de sesion en swaglabs
  Yo como usuario de la app swaglabs
  Quiero cerrar sesion
  para quedar deslogueado de la app

  Scenario: cierre de sesion exitoso
    Given que ingreso a la aplicacion swaglabs
    When inicio sesion en la aplicacion
    And realizo el cierre de sesion
    Then deberia volver al menu de inicio de sesion