package builder.ejemplos.pizza;

/**
 * @author fobregon
 */
public class TestPizza {

    public static void main(String[] args) {

    	DirectorPizza director = new DirectorPizza(new ConstructorPizzaPicante());
    	director.hacerPizza(Ingrediente.JAMON);
    	
        Pizza pizza = director.getPizza();

        System.out.println(pizza.toString());

    }

}
