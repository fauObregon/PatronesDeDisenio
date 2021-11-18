package prototype.patron;

/**
 * @author fobregon
 * 
 * PrototipoConcreto: Implementaciones concretas de InterfazPrototipo los cuales podrán ser clonados.
 */
public class ConcretePrototypeTwo implements IPrototype {
    @Override
    public IPrototype clon() {

        ConcretePrototypeTwo copyObject = null;

        try{
            copyObject = (ConcretePrototypeTwo)super.clone();
        }catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return copyObject;
    }

    @Override
    public String toString() {
        return "Concrete Prototype Two";
    }
}
