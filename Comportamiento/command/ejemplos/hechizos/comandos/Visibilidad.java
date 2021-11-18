package command.ejemplos.hechizos.comandos;

/**
 * 
 * @author fobregon
 *
 */
public enum Visibilidad {

    VISIBLE("visible"), INVISIBLE("invisible"), INDEFINIDO("");

    private String titulo;

    Visibilidad(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}