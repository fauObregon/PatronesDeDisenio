package prototype.patron;

/**
 * @author fobregon
 * 
 * PrototipoConcreto: Implementaciones concretas de InterfazPrototipo los cuales podr�n ser clonados.
 */
public class ConcretePrototypeOne implements IPrototype {
    @Override
    public IPrototype clon() {

        ConcretePrototypeOne copyObject = null;

        try{
            copyObject = (ConcretePrototypeOne)super.clone();
        }catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return copyObject;
    }

    @Override
    public String toString() {
        return "Concrete Prototype One";
    }
}
