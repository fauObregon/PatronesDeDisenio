package abstractfactory.patron;

/**
 * @author fobregon
 * 
 * ProductoConcreto: Representa una implementaci�n concreta de la interface IProduct, la cual es creada a trav�s del ConcreteFactory.
 */
public class ProductATwo extends AbstractProductA {

    public ProductATwo(String name, String description){
        super(name, description);
    }

    public ProductATwo(){
        setName("Product A - Part Two");
        setDescription("Description of Product A - Part Two");
    }

}
