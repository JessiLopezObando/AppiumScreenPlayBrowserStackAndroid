#language: en
  Feature: Iniciar sesion en la app saucelabs

    Scenario: Iniciar sesion exitosa
      Given El usuario quiere comprar vestuarios
      When El usuario introduce las credenciales standard_user secret_sauce
      Then El usuario debe ver la lista de productos