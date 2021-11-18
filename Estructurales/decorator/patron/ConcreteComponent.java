package decorator.patron;

/**
 * 
 * @author fobregon
 *
 * ComponenteConcreto: Componente real al cual se la pueden a�adir responsabilidades adicionales.
 */
public class ConcreteComponent implements IComponent {

    @Override
    public void doOperation() {
        System.out.println("Concrete Component doing operation");
    }
}
