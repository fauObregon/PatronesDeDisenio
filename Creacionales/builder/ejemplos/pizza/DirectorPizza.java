package builder.ejemplos.pizza;

/**
 * @author fobregon
 * 
 * DirectorPizza: Se encarga de construir un objeto utilizando el Constructor (ConstructorPizza).
 */
public class DirectorPizza {

    private IConstructorPizza iConstructorPizza;

    public DirectorPizza(IConstructorPizza iConstructorPizza) {
        this.iConstructorPizza = iConstructorPizza;
    }

    public Pizza getPizza(){
        return iConstructorPizza.getPizza();
    }

    public DirectorPizza hacerPizza(Ingrediente cubierta){
        //constructorPizza.crearNuevoProductoPizza();
        iConstructorPizza.establecerCubierta(cubierta);
        return this;
    }

}
