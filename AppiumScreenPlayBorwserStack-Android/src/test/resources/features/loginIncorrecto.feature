#language: en
Feature: Iniciar sesion sin exito
  Yo como usuario de la app saucelabs
  Quiero ingresar las credenciales incorrecto
  Para confirmar si me valida las credenciales


  Scenario Outline:Iniciar sesion sin exito
    Given el usuario se encuentra en la pagina de incio
    When el usuario introduce las credenciales invalida usuario <usuario> contrasenia <contrasenia>
    Then el usuario debe ver un mensaje compra exitosa
    Examples:
      | usuario         | contrasenia    |
      | "standard_user" | "secret_sauce5566" |