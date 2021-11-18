package decorator.patron;

/**
 * 
 * @author fobregon
 *
 * Decorador: Se trata de una clase abstracta que contiene una referencia al componente asociado. 
 * Debe implementar a la interfaz Componente, en la que delegará la funcionalidad real.
 */
public abstract class Decorator implements IComponent {

    protected IComponent iComponent;

    public Decorator(IComponent iComponent){
        this.iComponent = iComponent;
    }

    @Override
    public void doOperation() {
        iComponent.doOperation();
    }
}
