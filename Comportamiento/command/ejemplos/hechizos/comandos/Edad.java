package command.ejemplos.hechizos.comandos;

/**
 * 
 * @author fobregon
 *
 */
public enum Edad {
    JOVEN("joven"), ADULTO("adulto"), ANCIANO("anciano"), INDEFINIDO("");

    private String titulo;

    Edad(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
