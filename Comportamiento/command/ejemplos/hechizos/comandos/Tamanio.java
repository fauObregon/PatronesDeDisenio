package command.ejemplos.hechizos.comandos;

/**
 * 
 * @author fobregon
 *
 */
public enum Tamanio {

    PEQUENIO("pequeño"), NORMAL("normal"), GRANDE("grande"), INDEFINIDO("");

    private String titulo;

    Tamanio(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}