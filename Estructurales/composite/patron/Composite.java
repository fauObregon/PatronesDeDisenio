package composite.patron;

import java.util.ArrayList;

/**
 * @author fobregon
 * 
 * Compuesta: Este componente es el que le da vida al patron de diseño ya que este objeto estÃ¡ conformado por un conjunto de Componentes y hojas. 
 * En teoria de Arboles este componente representara una rama.
 */
public class Composite extends Component{

    private ArrayList<Component> components;

    public Composite(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void doSomething() {
        System.out.println(getName() + " doing something...");
        for(Component component : components){
            component.doSomething();
        }
    }
}
