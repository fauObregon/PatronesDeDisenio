package abstractfactory.patron;

/**
 * @author fobregon
 * 
 * FabricaConcreta: Representa una fábrica concreta la cual es utilizada para la creación de los ConcreteProduct, esta clase hereda el comportamiento básico del AbstractFactory.
 */
public class ConcreteFactoryTwo extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductATwo();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBTwo();
    }
}
