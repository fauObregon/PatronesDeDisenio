package builder.ejemplos.pizza;

/**
 * @author fobregon
 */
public enum Ingrediente {

    PEPPERONI, SALAMI, JAMON, CHAMPINIONES, PINIA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
