Feature: Compra de un producto en swaglabs
  Yo como usuario de la app swaglabs
  Quiero realizar la compra de un producto
  para hacer uso del producto

  Scenario: inicio de sesion exitoso
    Given que iniciamos a la aplicacion swaglabs
    When iniciamos sesion en la app con credenciales validas
    And agrego un producto al carro y realizo la compra
    Then deberia ver un mensaje de compra exitosa