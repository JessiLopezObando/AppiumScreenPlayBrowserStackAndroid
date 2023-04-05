Feature: Compra de un producto en swaglabs
  Yo como usuario de la app swaglabs
  Quiero realizar la compra de un producto
  para hacer uso del producto

  Scenario: Compra de producto exitosa
    Given que inicio en la aplicacion swaglabs
    When inicio sesion en la app con credenciales validas
    And agrego un producto al carrito y realizo la compra
    Then deberia ver un mensaje de compra exitosa