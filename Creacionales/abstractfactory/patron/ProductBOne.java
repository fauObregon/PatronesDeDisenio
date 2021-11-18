package abstractfactory.patron;

/**
 * @author fobregon
 * 
 * ProductoConcreto: Representa una implementación concreta de la interface IProduct, la cual es creada a través del ConcreteFactory.
 */
public class ProductBOne extends AbstractProductB {

    public ProductBOne(String name, String description){
        super(name, description);
    }

    public ProductBOne(){
        setName("Product B - Part One");
        setDescription("Description of Product B - Part One");
    }

}
