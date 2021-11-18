package decorator.ejemplos.pizzas;

/**
 * 
 * @author fobregon
 *
 * Decorador: (DecoradorDeTopicos) Se trata de una clase abstracta que contiene una referencia al componente asociado. 
 * Debe implementar a la interfaz Pizza, en la que delegará la funcionalidad real.
 */
public abstract class ToppingDecorador implements IPizza {

    protected IPizza temporalPizza;

    public ToppingDecorador(IPizza temporalPizza) {
        this.temporalPizza = temporalPizza;
    }

    @Override
    public String getDescripcion() {
        return temporalPizza.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return temporalPizza.getPrecio();
    }
}
