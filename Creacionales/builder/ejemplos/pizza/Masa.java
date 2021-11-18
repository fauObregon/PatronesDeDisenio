package builder.ejemplos.pizza;

/**
 * @author fobregon
 */
public enum Masa {

    FINA, GRUESA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
