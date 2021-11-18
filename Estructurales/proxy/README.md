# Proxy Pattern

Un **Proxy** o sustituto:
1. Crea una instancia del objeto real la primera vez que el cliente realiza una solicitud del proxy.
2. Recuerda la identidad de este objeto real.
3. Finalmente, env�a la solicitud del servicio al objeto real.

**Prop�sito:**
* Proveer un sustituto o *"placeholder"* de otro objeto para controlar el acceso a este.
* Usar un nivel extra de indirecci�n para permitir el acceso distribuido, controlado e inteligente.
* Agregar un *"wrapper"* para proteger el componente real de la complejidad innecesaria. Este *wrapper* permite agregar funcionalidad al objeto de inter�s sin cambiar el c�digo del objeto.

Aunque a simple vista tenga similitudes al patr�n Facade, ambos tiene matices diferentes. 
* Mientras que los objetos Proxy representan a un objeto, los objetos Facade representan a un subsistema de objetos.
* Un objeto cliente Proxy no puede acceder a un objeto interno directamente, mientras que Facade no lo impide.
* Un objeto Proxy provee control de acceso a un �nico objeto de inter�s. Sin embargo, un objeto Facade provee una interface de alto nivel a un subsistema de objetos.

**Aplicaci�n:**
* Cuando haya necesidad de una referencia m�s vers�til y sofisticada a un objeto, no un simple puntero.
* Para adicionar seguridad al acceso de un objeto. El Proxy determinar� si el cliente puede acceder al objeto de inter�s.
* Para proporcionar una API simplificada para que el c�digo del cliente no tenga que lidiar con la complejidad del c�digo del objeto de inter�s.
* Para proporcionar una interfaz de los *web services* o recursos *REST*.


## Escenarios de uso:

Se necesita una referencia a un objeto m�s flexible o sofisticada que un puntero. 
Seg�n la funcionalidad requerida podemos encontrar varias aplicaciones:

- **Apoderado remoto (Remote Proxy):** Representa un objeto local que pertenece a un espacio de direcciones diferente.
- **Apoderado virtual (Virtual Proxy):** Retrasa la creaci�n de objetos costosos. En lugar de un objeto complejo o pesado, utiliza una representaci�n de esqueleto. Consideremos una imagen la cual es enorme en tama�o, podemos representarla mediante un objeto proxy virtual y cuando sea solicitado cargamos el objeto real.
- **Apoderado de protecci�n (Protection Proxy):** Controla el acceso a un objeto original. Este tipo es �til cuando se necesita manejar diferentes permisos de acceso.
- **Referencia inteligente:** Tiene la misma finalidad que un puntero pero adem�s ejecuta acciones adicionales sobre el objeto, como por ejemplo el control de concurrencia.

## Estructura
![proxy_pattern](proxy_pattern.png)
