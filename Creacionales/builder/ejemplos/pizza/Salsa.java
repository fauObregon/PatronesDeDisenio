package builder.ejemplos.pizza;

/**
 * @author fobregon
 */
public enum Salsa {

    PICANTE, MODERADO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
