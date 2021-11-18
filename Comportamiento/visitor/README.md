## Visitor Pattern


**Prop�sito:** Separar el algoritmo de la estructura de un objeto.

El patr�n de dise�o Visitor se utiliza para separar la l�gica u operaciones que se pueden realizar sobre una estructura compleja. En ocasiones nos podemos encontrar con estructuras de datos que requieren realizar operaciones sobre ella, pero estas operaciones pueden ser muy variadas e incluso se pueden desarrollar nuevas a medida que la aplicaci�n crece.

A medida que estas operaciones crecen, el n�mero de operaciones que deber� tener la estructura tambi�n crecer� haciendo que administrar la estructura sea muy complejo. Por esta raz�n el patr�n de dise�o Visitor propone la separaci�n de estas operaciones en clases independientes llamadas Visitantes, las cuales son creadas implementando una interface com�n y no requiere modificar la estructura inicial para agregar la operaci�n.

La idea b�sica es que se tiene un conjunto de clases elemento que conforman la *estructura* de un objeto. Cada una de estas clases elemento tiene un m�todo aceptar (accept()) que recibe al objeto visitante (visitor) como argumento. El visitante es una interfaz que tiene un m�todo visit diferente para cada clase elemento; por tanto habr� implementaciones de la interfaz visitor de la forma: visitorClase1, visitorClase2... visitorClaseN. El m�todo accept de una clase elemento llama al m�todo visit de su clase.

Si hay demasiadas implementaciones de la interface visitor, se hace dificil extender.


**Aplicaci�n:** Usamos el patr�n Visitor cuando ...
* Se desea mover la l�gica operacional desde los objetos a otra clase.
* Se desea definir una operaci�n sobre objetos de una jerarqu�a de clases sin modificar las clases sobre las que opera.
* Se desea representar una operaci�n que se realiza sobre los elementos que conforman la estructura de un objeto
* Teniendo un buen n�mero de instancias de un peque�o n�mero de clases, se desea realizar alguna operaci�n que involucra a todas o a la mayor�a de ellas.

## Estructura
![visitor_pattern](visitor_pattern.png)