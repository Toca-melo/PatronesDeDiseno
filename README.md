Patrón Mediator
En este caso, se implementó el patrón Mediator para actuar como intermediario entre las clases Coche, Teléfono y Radio. De este modo, cada clase no necesita conocer directamente a las demás. Se creó una interfaz llamada Mediator, que contiene los métodos necesarios para interactuar con instancias de otras clases. Además, se desarrolló una clase llamada ConcreteMediator, la cual funciona como el mediador entre las diferentes clases, gestionando la comunicación y coordinación entre ellas.

Patrón Decorator
El objetivo principal del patrón Decorator es extender la funcionalidad de los objetos de manera flexible y reutilizable, sin modificar la clase original ni utilizar la herencia. Esto se logra "envolviendo" el objeto original con un objeto decorador, que añade nuevas funcionalidades. De esta manera, se pueden agregar comportamientos adicionales a los objetos de forma dinámica, manteniendo la clase original intacta.
