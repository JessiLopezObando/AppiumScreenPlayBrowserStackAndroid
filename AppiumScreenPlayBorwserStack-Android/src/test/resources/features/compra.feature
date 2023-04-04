Feature: Compra producto
  Yo como usuario de la app SauceLabs
  Quiero elegir productos
  Para comprarlos desde la app

  Scenario: Compra producto sauce lab
    Given el usuario inicia sesion en la aplicacion
    When elige un producto y lo compra
    Then debe visualizar un mensaje con informacion de la compra