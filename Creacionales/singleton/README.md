# Singleton Pattern

**Prop�sito:** Asegurar que una clase tenga una �nica instancia y proporcionar un punto de acceso global a la misma. El *cliente* llama a la funci�n de acceso cuando se requiere una referencia a la instancia �nica.

El patr�n de dise�o Singleton (Unico) recibe su nombre debido a que s�lo se puede tener una �nica instancia para toda la aplicaci�n de una determinada clase, esto se logra restringiendo la libre creaci�n de instancias de esta clase mediante el operador new e imponiendo un constructor privado y un m�todo est�tico para poder obtener la instancia.

La intenci�n de este patr�n es garantizar que solamente pueda existir una �nica instancia de una determinada clase y que exista una referencia global en toda la aplicaci�n.


**Aplicaci�n:** Usamos el patr�n Singleton...
* La aplicaci�n necesita una, y s�lo una, instancia de una clase, adem�s est� instancia requiere ser accesible desde cualquier punto de la aplicaci�n.
* Tipicamente para:
  * Manejar conexiones con la base de datos.
  * La clase para hacer Login.

**Ventajas:**
* Permite variar la representaci�n interna de un objeto 
* A�sla el c�digo de representaci�n del cliente
* Da m�s control sobre el proceso de construcci�n

**Desventaja:**
* Se requiere m�s conocimiento del dominio para construir los objetos

## Estructura
![singleton_pattern](singleton_pattern.png)
  