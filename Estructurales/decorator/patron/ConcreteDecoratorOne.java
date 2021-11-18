package decorator.patron;

/**
 * 
 * @author fobregon
 *
 * DecoradorConcreto: Elemento real que a�adir� las funcionalidades y/o responsabilidades al componente objetivo.
 */
public class ConcreteDecoratorOne extends Decorator {

    public ConcreteDecoratorOne(IComponent iComponent) {
        super(iComponent);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        doAdditionalOperation();
    }

    public void doAdditionalOperation() {
        System.out.println("Doing additional operation concrete decorator ONE.");
    }
}
