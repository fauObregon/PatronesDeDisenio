package abstractfactory.patron;

/**
 * @author fobregon
 * 
 * ProductoConcreto: Representa una implementación concreta de la interface IProduct, la cual es creada a través del ConcreteFactory.
 */
public class ProductBTwo extends AbstractProductB  {

    public ProductBTwo(String name, String description){
        super(name, description);
    }

    public ProductBTwo(){
        setName("Product B - Part Two");
        setDescription("Description of Product B - Part Two");
    }

}
