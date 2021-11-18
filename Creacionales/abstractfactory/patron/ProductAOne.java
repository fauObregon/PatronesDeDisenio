package abstractfactory.patron;

/**
 * @author fobregon
 *  
 * ProductoConcreto: Representa una implementación concreta de la interface IProduct, la cual es creada a través del ConcreteFactory.
 */
public class ProductAOne extends AbstractProductA{

    public ProductAOne(String name, String description){
        super(name, description);
    }

    public ProductAOne(){
        setName("Product A - Part One");
        setDescription("Description of Product A - Part One");
    }

}
