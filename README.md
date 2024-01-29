# Wander Wisely

Aplicación sobre **rutas de senderismo**. La app permite visualizar rutas de senderismo, así como calificarlas y compartir nuevas rutas con la comunidad.

-------

### Características

#### Comunidad
La aplicación presenta una base de datos, gestionada con **Firebase**, para compartir rutas con la comunidad de la aplicación. De esta manera, todos los usuarios
pueden ver las rutas que otros comparten. Por este motivo es necesario registrarse mediante un correo electrónico y una contraseña.

#### Rutas
La aplicación implementa la **API de Google Maps** para poder visualizar directamente sobre un mapa satelital la ruta mediante una línea en rojo.


![Imagen de muestra](https://i.imgur.com/60tl1nQ.png)

#### Modelo MVVM
La aplicación se ha construído en torno a la arquitectura MVVM (Model-View-ViewModel).

### Interfaz de usuario

Para la interfaz de usuario se ha utilizado **Jetpack Compose**: un toolkit utilizado para el desarrollo de UIs nativas.

#### Diseño responsive
La aplicación presenta un **diseño responsive**, con soporte para **modo oscuro** y **modo claro**, además de adaptarse correctamente tanto a la orientación
vertical como la horizontal
