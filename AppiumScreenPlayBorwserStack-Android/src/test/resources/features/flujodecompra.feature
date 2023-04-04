#language: en
Feature: Compra de productos en SWAG LABS
  yo como usuario de la app
  quiero empezar a comprar productos

  Scenario: Compra exitosa de un producto
    Given Given que estoy logueado en la app con credenciales correctas
    When he agregado el producto que quiero comprar
    And ingreso al carrito a finalizar compra
    Then se muestra el mensaje de orden finalizada
