package abstractfactory.patron;

/**
 * @author fobregon
 * 
 * FabricaAbstracta: Este componente puede ser opcional, sin embargo, se recomienda la creaci�n de un AbstractFactory que define el comportamiento por default de los ConcreteFactory.
 */
public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
