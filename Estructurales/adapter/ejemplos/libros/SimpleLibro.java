package adapter.ejemplos.libros;

 /**
  * @author fobregon
  * 
 * Se trata de la clase adaptada (o a adaptar).
 * Se trata de una clase existente la cual pretendemos adaptar para que funcione bajo una nueva interfaz.
 * Puede haber varios Adaptados.
 */
public class SimpleLibro {

    private String titulo;
    private String autor;

    public SimpleLibro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
