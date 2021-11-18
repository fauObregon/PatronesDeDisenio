package builder.ejemplos.pizza;

/**
 * @author fobregon
 * 
 * ConstructorPizza: Interfaz abstracta que permite la creación de objetos Pizza.
 */
public interface IConstructorPizza {

    public Pizza getPizza();
    
    public void crearNuevoProductoPizza();

    public IConstructorPizza establecerSalsa(Salsa salsa);

    public IConstructorPizza establecerMasa(Masa masa);

    public IConstructorPizza establecerCubierta(Ingrediente cubierta);

}
