package facade.patron;

/**
 * @author fobregon
 * 
 * Cliente: Sistema o evento que interact�a con la fachada.
 */
public class Client {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.doSomethingInOne();
        facade.doSomethingInOTwo();
        facade.doSomething();

    }
}
