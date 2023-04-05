#language: en
  Feature: Iniciar sesion en la app saucelabs
    Yo como usuario de la app saucelabs
    Quiero ver los diferentes diseños de ropa
    Para comprar vestuario de mi interes


    Scenario: Iniciar sesion exitosa
      Given El usuario quiere comprar vestuarios
      When El usuario introduce las credenciales standard_user secret_sauce
      Then El usuario debe ver un mensaje compra exitosa