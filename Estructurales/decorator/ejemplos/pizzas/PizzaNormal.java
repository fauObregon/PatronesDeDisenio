package decorator.ejemplos.pizzas;

/**
 * 
 * @author fobregon
 *
 * ComponenteConcreto: (PizzaNormal) Componente real al cual se la pueden añadir responsabilidades adicionales.
 */
public class PizzaNormal implements IPizza {

    public PizzaNormal() {
        System.out.println("Agregar Masa Fina");
    }

    @Override
    public String getDescripcion() {
        return "Masa Fina";
    }

    @Override
    public double getPrecio() {
        System.out.println("Precio de Masa Fina: " + 4.00);
        return 4.00;
    }
}
