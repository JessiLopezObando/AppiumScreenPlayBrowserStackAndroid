Feature: Inicio de sesion en swaglabs
  Yo como usuario de la app swaglabs
  Quiero iniciar sesion
  para quedar logueado en la app

  Scenario: inicio de sesion exitoso
    Given que accedo a la aplicacion swaglabs
    When Ingreso los datos de usuario y contraseña
    Then el inicio de sesion se deberia realizar correctamente