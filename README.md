# Patrón Mediator
En este caso, se implementó el patrón Mediator para actuar como intermediario entre las clases Coche, Teléfono y Radio. De este modo, cada clase no necesita conocer directamente a las demás. Se creó una interfaz llamada Mediator, que contiene los métodos necesarios para interactuar con instancias de otras clases. Además, se desarrolló una clase llamada ConcreteMediator, la cual funciona como el mediador entre las diferentes clases, gestionando la comunicación y coordinación entre ellas.

![Desktop Screenshot 2024 05 23 - 10 17 57 17](https://github.com/Toca-melo/PatronesDeDiseno/assets/114452776/2d4d7b68-b7b2-4d6d-aaae-88eab9dd5b9b)


# Patrón Decorator
El objetivo principal del patrón Decorator es extender la funcionalidad de los objetos de manera flexible y reutilizable, sin modificar la clase original ni utilizar la herencia. Esto se logra "envolviendo" el objeto original con un objeto decorador, que añade nuevas funcionalidades. De esta manera, se pueden agregar comportamientos adicionales a los objetos de forma dinámica, manteniendo la clase original intacta.

![Desktop Screenshot 2024 05 23 - 10 29 13 95](https://github.com/Toca-melo/PatronesDeDiseno/assets/114452776/de61b105-a5ff-46df-9cfe-21f401fc0f82)

# Patrón Singleton
Lo que hice fue crear una instancia de una clase que contenia una lista de marca de carro En la clase singleton esta contenida toda la informacion de las algunas marcas de carros guardadas en una lista En si este patron de diseno lo que garantiza es que se haga una sola instancia de esta lista en toda la aplicacion.
