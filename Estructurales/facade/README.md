 Facade Pattern

**Prop�sito:** Proporcionar una interfaz unificada para un conjunto de interfaces de un subsistema. *Facade* define una interfaz de alto nivel que hace que el subsistema sea m�s f�cil de usar.

El patr�n Facade (fachada) tiene la caracter�stica de ocultar la complejidad de interactuar con un conjunto de subsistemas proporcionando una interface de alto nivel, la cual se encarga de realizar la comunicaci�n con todos los subsistemas necesarios. La fachada es una buena estrategia cuando requerimos interactuar con varios subsistemas para realizar una operaci�n concreta ya que se necesita tener el conocimiento t�cnico y funcional para saber qu� operaciones de cada subsistema tenemos que ejecutar y en qu� orden, lo que puede resultar muy complicado cuando los sistemas empiezan a crecer demasiado.


**Detalles:**
* Este patr�n protege los clientes de los componentes del subsistema, propiciando el menor uso de componentes para que el subsistema pueda ser utilizado.
* Adem�s, promueve un bajo acoplamiento entre subsistemas y clientes.
* Este patr�n no evita que los clientes usen las clases internas del subsistema, si es que es necesario.
* Es importante mencionar que el objeto *Facade* debe ser extremadamente simple. **No** debe convertirse en un **objeto "dios".**

**Aplicaci�n:** Usamos el patr�n
* Cuando queremos encapsular un subsistema complejo con una interface m�s simple.
* Para crear una interface simplificada que ejecuta muchas acciones "detras del escenario".
* Existen muchas dependencias entre clientes y la implementaci�n de clases de una abstracci�n. Se introduce el facade para desacoplar el subsistema de los clientes y otros subsistemas.
* Necesitamos *desacoplar* subsistemas entre s�, haciendo que se comuniquen �nicamente mediante *Facades*.
* Para definir un punto de entrada a cada nivel del subsistema.

**Ventajas:**
* Ayuda a dividir un sistema en capas.
* Reduce dependencias de compilaci�n.
* Se evita la herencia que por los tipos de relaciones puede ser complicada de usar.


**Desventajas:**
* Permite vulnerar seguridad, al dejar clases abiertas.
* Muchas clases peque�as
* Hay problemas cuando el c�digo depende de clases espec�cas
* Mucha complejidad para instanciar un Componente

## Estructura
![facade_pattern](facade_pattern.png)
