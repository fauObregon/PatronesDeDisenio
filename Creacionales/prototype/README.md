# Prototype Pattern

**Prop�sito:** Especificar varios tipos de objetos que pueden ser creados en un prototipo para crear nuevos objetos copiando ese prototipo. Reduce la necesidad de crear subclases.

El patr�n Prototype basa su funcionalidad en la clonaci�n de objetos, estos nuevos objetos son creados mediante un pool de prototipos elaborados previamente y almacenados. 

Este patr�n es especialmente �til cuando necesitamos crear objetos basados en otros ya existentes o cuando se necesita la creaci�n de estructuras de objetos muy grandes, este patr�n nos ayuda tambi�n a ocultar la estrategia utilizada para clonar un objeto.


**Aplicaci�n:** Usamos el patr�n Prototype...
* Queremos crear nuevos objetos mediante la *clonaci�n* o *copia* de otros.
* Cuando tenemos muchas clases potenciales que queremos usar s�lo si son requeridas durante el tiempo de ejecuci�n.

**Ventajas:**
* Acceso controlado a una �nica instancia 
* Permite a�adir y eliminar clases en tiempo de ejecuci�n 
* Reduce la herencia
* Reduce el costo de crear nuevos objetos

**Desventajas:**
* Cada subclase de Prototipo debe implementar la operaci�n clonar

## Estructura
![prototype_pattern](prototype_pattern.png)