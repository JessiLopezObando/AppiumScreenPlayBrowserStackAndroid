Feature: Logout de sesion en swaglabs
  Yo como usuario de la app swaglabs
  Quiero cerrar sesion
  para quedar deslogueado en la app

  Scenario: cierre de sesion exitoso
    Given que ingresamos a la aplicacion swaglabs
    When iniciamos sesion en la aplicacion
    And realizamos el cierre de sesion
    Then volvemos al menu de inicio de sesion