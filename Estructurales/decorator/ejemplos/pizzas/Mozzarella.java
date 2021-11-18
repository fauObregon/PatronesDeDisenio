package decorator.ejemplos.pizzas;

/**
 * 
 * @author fobregon
 *
 * DecoradorConcreto: Mozzarela Elemento real que añadirá las funcionalidades y/o responsabilidades al componente objetivo.
 */
public class Mozzarella extends ToppingDecorador {

    public Mozzarella(IPizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Agregando Mozzarella");
    }

    @Override
    public String getDescripcion() {
        return temporalPizza.getDescripcion() + ", mozzarella";
    }

    @Override
    public double getPrecio() {
        System.out.println("Precio de mozarrella: " + .50);
        return temporalPizza.getPrecio() + .50;
    }

}
