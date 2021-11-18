package composite.patron;

/**
 * @author fobregon
 * 
 * Hoja: El leaf u hoja, representa la parte mas simple o pequeña de toda la estructura y esta hereda de Component. 
 * Leaf recibe su nombre de la teoria de arboles, donde se le nombra asi a todo nodo que no tiene descendencia, 
 * en este caso son clases simple que no estan compuestas de otras.
 */
public class Leaf extends Component{

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println("    " + getName() + " doing something...");
    }
}
