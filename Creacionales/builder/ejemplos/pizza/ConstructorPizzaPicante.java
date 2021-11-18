package builder.ejemplos.pizza;

/**
 * @author fobregon
 * 
 * ConstructorPizzaPicante: Implementaci�n concreta del ConstructorPizza definida para cada uno de los tipos. 
 * Permite crear el objeto concreto recopilando y creando cada una de las partes que lo compone.
 */
public class ConstructorPizzaPicante implements IConstructorPizza {
	
	private Pizza pizza;

    public ConstructorPizzaPicante(){
        this.crearNuevoProductoPizza();
        this.establecerMasa(Masa.GRUESA);
        this.establecerSalsa(Salsa.PICANTE);
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
    	this.getPizza().setCubierta(cubierta);
        return this;
    }

}
