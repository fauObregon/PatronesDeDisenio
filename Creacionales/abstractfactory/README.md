# Abtract Factory Pattern

**Prop�sito:** Proveer una interfaz para la creaci�n de familias u objetos dependientes relacionados, sin especificar sus clases concretas.

Es una jerarqu�a que encapsula muchas *familias* posibles y la creaci�n de un conjunto de *productos*. El objeto "f�brica" tiene la responsabilidad de proporcionar servicios de creaci�n para toda una familia de productos. Los "clientes" nunca crean directamente los objetos de la familia, piden la f�brica que los cree por ellos.

Esta se usa cuando hay varios productos con estructura similar pero diferente comportamiento.


**Aplicaci�n:** Usamos el patr�n Abstract Factory...
* Cuando tenemos una o m�ltiples familias de productos.
* Cuando tenemos muchos objetos que pueden ser cambiados o agregados durante el tiempo de ejecuci�n.
* Cuando queremos obtener un objeto compuesto de otros objetos, los cuales desconocemos a que clase pertenecen.
* Para encapsular la creaci�n de muchos objetos.

## Estructura
![abstract_factory_pattern](abstract_factory_pattern.png)