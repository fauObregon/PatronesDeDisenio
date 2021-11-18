package builder.ejemplos.pizza;

/**
 * @author fobregon
 * 
 * ConstructorPizzaHawaina: Implementación concreta del ConstructorPizza definida para cada uno de los tipos. 
 * Permite crear el objeto concreto recopilando y creando cada una de las partes que lo compone.
 */
public class ConstructorPizzaHawaiana implements IConstructorPizza{
	
	private Pizza pizza;

    public ConstructorPizzaHawaiana(){
        this.crearNuevoProductoPizza();
        this.establecerMasa(Masa.FINA);
        this.establecerSalsa(Salsa.MODERADO);
    }

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

	@Override
	public void crearNuevoProductoPizza() {
		this.pizza = new Pizza();
		
	}

	@Override
	public IConstructorPizza establecerSalsa(Salsa salsa) {
		this.pizza.setSalsa(salsa);
		return this;
	}

	@Override
	public IConstructorPizza establecerMasa(Masa masa) {
		this.pizza.setMasa(masa);
		return this;
	}
	
	@Override
    public IConstructorPizza establecerCubierta(Ingrediente cubierta) {
        this.pizza.setCubierta(cubierta);
        return this;
    }

}
