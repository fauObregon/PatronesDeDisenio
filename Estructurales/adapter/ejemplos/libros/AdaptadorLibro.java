package adapter.ejemplos.libros;

/**
 * @author fobregon
 * 
 * Clase que implementara la interfaz Objetiva (Libro) y se encargara de que la antigua funcionalidad obedezca a la misma.
 */
public class AdaptadorLibro implements ILibro{

    private SimpleLibro libro;

    public AdaptadorLibro(final SimpleLibro libro) {
        this.libro = libro;
    }

    @Override
    public String getTituloYAutor(){
        return libro.getTitulo() + ". por " + libro.getAutor();
    }

}
