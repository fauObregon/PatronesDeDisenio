package facade.patron;

/**
 * 
 * @author fobregon
 *
 * Fachada: Clase que trata de ofrecer la funcionalidad que demanda el cliente mediante una interfaz sencilla donde, internamente, utiliza las clases subsistemas.
 * 
 */
public class Facade implements IFacade {

    private SubsystemOne one;
    private SubsystemTwo two;

    public Facade() {
        System.out.println("Este es el Patron Facade...");
        this.one = new SubsystemOne();
        this.two = new SubsystemTwo();
    }

    public void doSomethingInOne() {
        System.out.println("Llamando doSomething en accion UNO:");
        one.doSomethingOne();
    }

    public void doSomethingInOTwo() {
        System.out.println("Llamando doSomething en accion DOS:");
        two.doSomethingTwo();
    }

    @Override
    public void doSomething() {
        System.out.println("Llamando doSomething en accion UNO y DOS:");
        one.doSomethingOne();
        two.doSomethingTwo();
    }
}
