package adapter.ejemplos.libros;

import adapter.ejemplos.libros.Cliente;
import adapter.ejemplos.libros.ILibro;


 /**
  * @author fobregon
  * 
  * Utiliza la funcionalidad de la clase Adaptada (SimpleLibro) 
  * de acuerdo a la interfaz Objetivo (Libro) 
  * implementada por Adaptor (AdaptadorLibro).
  */

 /**
 * Se aplica cuando:
 * Pretendemos usar una clase existente cuya interfaz no es compatible con la requerida.
 * Tenemos que implementar una clase que pueda ser reusable y que coopere con clases no relacionadas, es decir, las clases que no tienen necesariamente interfaces compatibles.
 * 
 * Ventajas: hace que dos interfaces incompatibles, sean compatibles. Sirve para encapsular clases que no controlamos, y que pueden cambiar.
 * Desventajas: Añade complejidad adicional al diseño.
 */

/**
 * Utiliza la funcionalidad de SimpleLibro de acuerdo a la interfaz Libro implementada por AdaptadorLibro.
 */
public class Cliente {
    public static void main(String[] args) {
        ILibro iLibro;
        iLibro = new AdaptadorLibro(new SimpleLibro("Refactorizando", "Pablo Perez"));
        System.out.println(iLibro.getTituloYAutor());
    }
}
