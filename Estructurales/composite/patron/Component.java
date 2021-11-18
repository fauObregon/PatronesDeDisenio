package composite.patron;

/**
 * @author fobregon
 * 
 * Componente: Generalmente es una interface o clase abstracta que tiene las operaciones minimas que serian utilizadas, 
 * este componente debera ser extendido por los otros dos componentes Leaf y Composite.
 */
public abstract class Component {

    protected String name;

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
    public abstract void doSomething();

    public String getName() {
        return name;
    }

}
