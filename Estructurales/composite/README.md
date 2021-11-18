# Composite Pattern

**Prop�sito:** Componer objetos en estructuras de �rbol que representan jerarqu�as de un *todo* y sus *partes.* El Composite provee a los *clientes* un mismo trato para todos los objetos que forman la jerarqu�a.

El patr�n de dise�o Composite nos sirve para construir estructuras complejas partiendo de otras mucho m�s simples; dicho de otra manera, podemos crear estructuras compuestas que est�n conformadas por otras estructuras m�s peque�as.

Pensemos en nuestro sistema de archivos, este contiene *directorios* con *archivos* y a su vez estos *archivos* pueden ser otros *directorios* que contenga m�s *archivos*, y as� sucesivamente. Lo anterior puede ser representado facilmente con el patr�n Composite.

**Aplicaci�n:** Usamos el patr�n Composite...
* Cuando queremos representar jerarqu�as de objetos
compuestas por un todo y sus partes.
* Se quiere que los *clientes* ignoren la diferencia
entre la composici�n de objetos y su uso
individual.

## Estructura
![composite_pattern](composite_pattern.png)