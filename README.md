# Appium ScreenPlay BrowserStack Android

Crear una cuenta en BrowserStack https://www.browserstack.com/

Descargar y ejecutar el sample de BrowserStack Appium with Java para Android
![image](https://user-images.githubusercontent.com/107648922/229818978-c33c3e9b-4f18-446e-893e-565c6ebcf21b.png)

1. Clonar este repositorio.
2. Descargar la APK. https://github.com/saucelabs/sample-app-mobile/releases
3. Subirlo en el BrowserStack para obtener el `bs`.
4. Tener en cuenta las credenciales `user`, `key` y `bs`.
5. Seleccionar en qué dispositivo van a ejecutar las pruebas en la nube.
6. Conectar BrowserStack con Appium inspector.

Realizar el login y una compra de un producto de su elección.

Valor agregado - Hacer Logout
- - -

## Ejecución

Para ejecutar efectivamente los test, es necesario crear un archivo `.env` en la ruta
`AppiumScreenPlayBorwserStack-Android/src/test/resources`. En este archivo se declaran las credenciales y algunos 
valores necesarios para una correcta ejecución. Su estructura debe ser como sigue.

```properties
BROWSERSTACK_USER=usuario de BrowserStack
BROWSERSTACK_KEY=key provista por BrowserStack
BROWSERSTACK_APP=bs://123... después de subir la APK
SWAGLABS_USER=usuario de la APK
SWAGLABS_PASSWORD=contraseña de ese usuario
NAME=nombre del comprador
LAST_NAME=apellido del comprador
ZIPCODE=código postal del comprador
```

De ser necesario el uso de otras variables de configuración, se pueden agregar y acceder desde este mismo archivo `.env`
- - -
*By: Jonathan Vargas 🐢 Ococho*

<a href="https://gitmoji.dev">
  <img
    src="https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg?style=flat-square"
    alt="Gitmoji"
  />
</a>