package abstractfactory.patron;

/**
 * @author fobregon
 * 
 * FabricaConcreta: Representa una f�brica concreta la cual es utilizada para la creaci�n de los ConcreteProduct, esta clase hereda el comportamiento b�sico del AbstractFactory.
 */
public class ConcreteFactoryOne extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBOne();
    }
}
