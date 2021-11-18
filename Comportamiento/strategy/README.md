# Strategy Pattern

**Prop�sito:** Definir una familia de algoritmos, encapsular cada uno, y que sean intercambiables. Strategy permite al algoritmo variar independientemente de los clientes que lo utilizan.

El patr�n de dise�o strategy permite establecer en tiempo de ejecuci�n el rol de comportamiento de una clase. 

Stretagy se basa en el polimorfismo para implementar una serie de comportamientos que podr�n ser intercambiados durante la ejecuci�n del programa, logrando con esto que un objeto se pueda comportar de forma distinta seg�n la estrategia establecida.

**Aplicaci�n:** Usamos el patr�n Strategy cuando queremos...
* Definir una familia de comportamientos.
* Definir variantes de un mismo algoritmo.
* Poder cambiar el comportamiento en tiempo de ejecuci�n, es decir, din�micamente.
* Reducir largas listas de condicionales.
* Evitar c�digo duplicado.
* Ocultar c�digo complicado, o que no queremos revelar, del usuario.

## Estructura
![strategy_pattern](strategy_pattern.png)