# Ejemplo simple de WebSocket con Grails

Aplicación Grails 3 para ejemplificar el uso de WebSockets

## Instrucciones

Clonar el repositorio, ingresar al directorio y ejecutar la aplicación con:

```
./grailsw run-app
```

Ingresar a `http://localhost:8080/example` y allí se podrá probar la funcionalidad utilizando u cliente JavaScript.

Para injectar un mensaje desde el ExampleService, abrir una nueva pestaña del navegador e ingresar a `http://localhost:8080/console` e ingresar el siguiente código:

```groovy
package grails.websocket.example

def service = ctx.getBean('exampleService')

service.hello()
```
Al ejecutarlo veremos el mensaje aparecer en la página del ejemplo.