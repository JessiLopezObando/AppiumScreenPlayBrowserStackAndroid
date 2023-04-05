Feature: Comprobar el login y el flujo de compra
  Yo como usuario de la app de compras
  Quiero Iniciar sesion y comprar productos de la app
  Para Verificar que el funcionamiento se correcto

  @FlujoDeCompra
  Scenario: Iniciar sesion y hacer flujo de compra completo
    Given Que el usuario ingresa a la aplicacion de compras del telefono android
    When Introduce sus credenciales validas de usuario "standard_user" y contrasenna "secret_sauce"
    And Selecciona los productos que desea comprar y hace la compra
    Then deberia ver la pagina de confirmacion de compra con un mensaje indicando que su compra se realizo con exito.