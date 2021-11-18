package prototype.patron;


/**
 * @author fobregon
 * 
 * Cliente: Componente que interact�a con los prototipos.
 */
public class Client {

    public static void main(String[] args) {

        PrototypeFactory factory = new PrototypeFactory();

        IPrototype object = new ConcretePrototypeOne();
        ConcretePrototypeOne clonedObject = (ConcretePrototypeOne) factory.getClone(object);

        System.out.println(object);
        System.out.println(clonedObject);
        System.out.println("Object: " + 
        		System.identityHashCode(System.identityHashCode(object)));
        System.out.println("Cloned Object HashCode: " + 
        		System.identityHashCode(System.identityHashCode(clonedObject)));

    }
}
