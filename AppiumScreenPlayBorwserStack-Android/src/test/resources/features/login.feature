Feature: Inicio de sesion en swaglabs
  Yo como usuario de la app swaglabs
  Quiero iniciar sesion
  para quedar logueado en la app

  Scenario: inicio de sesion exitoso
    Given que accedemos a la aplicacion swaglabs
    When Ingresamos los datos de usuario y contraseña
    Then observamos que el inicio de sesion se realiza correctamente