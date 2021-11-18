package decorator.ejemplos.pizzas;

/**
 * 
 * @author fobregon
 *
 * DecoradorConcreto: (SalsaDeTomate) Elemento real que añadirá las funcionalidades y/o responsabilidades al componente objetivo.
 */
public class SalsaDeTomate extends ToppingDecorador {

    public SalsaDeTomate(IPizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Agregando Salsa de Tomate");
    }

    @Override
    public String getDescripcion() {
        return temporalPizza.getDescripcion() + ", salsa de tomate";
    }

    @Override
    public double getPrecio() {
        System.out.println("Precio de la salsa de tomate: " + 2.50);
        return temporalPizza.getPrecio() + 2.50;
    }

}

