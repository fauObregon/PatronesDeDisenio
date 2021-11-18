# Decorator Patter

Extender la funcionalidad de los objetos se puede hacer de forma est�tica en nuestro c�digo (tiempo de **compilaci�n**) mediante el uso de la herencia, sin embargo, podr�a ser necesario extender la funcionalidad de un objeto de manera din�mica.

* Se pueden revocar responsabilidades antes asignadas a nuestros objetos.
* La extensi�n mediante herencia viola los principios SOLID.
* Necesitamos extender la funcionalidad de una clase pero la herencia no es una soluci�n viable.
* Necesitamos extender la funcionalidad de un objeto en tiempo de ejecuci�n e incluso eliminarla si fuera necesario.

**Prop�sito:** Adjuntar responsabilidades adicionales a un objeto de forma **din�mica**. Los *decoradores* proporcionan una alternativa flexible para ampliar la funcionalidad.

**Aplicaci�n:** Usamos el patr�n
* Cuando necesitamos a�adir o eliminar din�micamente las responsabilidades a un objeto, sin afectar a otros objetos.
* Cuando queremos tener las ventajas de la *Herencia* pero necesitemos a�adir funcionalidad durante el tiempo de ejecuci�n. Es m�s flexible que la *Herencia*,
* Simplificar el c�digo agregando funcionalidades usando muchas clases diferentes.
* Evitar sobreescribir c�digo viejo agregando, env�s, c�digo nuevo.

**Ventajas:**
* M�s flexibilidad que la herencia est�tica.
* Evita que las clases de arriba de la jerarqu�a est�n repletas de funcionalidades. 
* En vez de definir una clase compleja que trata de dar cabida a todas ellas, la funcionalidad se logra a�adiendo decoradores a una clase simple.
 
**Desventajas:** 
* Un decorador y sus componentes no son id�nticos, desde el punto de vista de la identidad de objetos, desde el punto de vista del programador o del cliente si que se podr�an considerar iguales.
* Muchos objetos peque�os. 
* El sistema puede ser m�s dif�cil de aprender y de depurar.

## Estructura
![decorator_pattern](decorator_pattern.png)