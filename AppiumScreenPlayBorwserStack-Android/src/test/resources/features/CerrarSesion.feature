Feature: Comprobar el login y el logout
  Yo como usuario de la app de compras
  Quiero Iniciar sesion y cerrar sesion
  Para Verificar que el funcionamiento se correcto

  @CerrarSesion
  Scenario: Cerrar Sesion
  Given que inicie sesion en la app de compras
  When voy a cerrar sesion en la app de compras
  Then la app me deberia redireccionar nuevamente a la pantalla de inicio de sesion
