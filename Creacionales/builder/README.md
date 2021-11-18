# Builder Pattern

**Prop�sito:** Separar la construcci�n de un objeto complejo de su representaci�n para que el mismo proceso de construcci�n puede crear diferentes representaciones.

Nos permite crear un objeto que est� compuesto por muchos otros objetos. S�lo el "*Builder*" conoce a detalle las clases concretas de los objetos que ser�n creados, nadie m�s.

En este patr�n intervienen un "*Director*" y un "*Builder*". El "*Director*" invoca los servicios del "*Builder*" el cual va creando las partes de un objeto complejo y al mismo tiempo guardo un estado intermedio de la construcci�n del objeto. Cuando el producto se ha construido por completo el *cliente* recupera el resultado.

A diferencia de otros patrones creacionales que construyen productos de una sola vez, el patr�n "*Builder*" construye paso a paso los productos bajo el control del "*Director*".

**Aplicaci�n:** Usamos el patr�n Builder cuando queremos...
* Construir un objeto compuesto de otros objetos.
* Que la creaci�n de las partes de un objeto sea independiente del objeto principal.
* Ocultar la creaci�n de las partes de un objeto del *cliente*, de esta manera no existe dependencia entre el *cliente* y las partes.

**Ventaja:**
* Permite variar la representaci�n interna de un objeto 
* A�sla el c�digo de representaci�n del cliente
* Da m�s control sobre el proceso de construcci�n


**Desventaja:**
* Se requiere m�s conocimiento del dominio para construir los objetos.


## Estructura
![builder_pattern](builder_pattern.png)