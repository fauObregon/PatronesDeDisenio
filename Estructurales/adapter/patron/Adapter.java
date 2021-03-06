package adapter.patron;


/**
 * @author fobregon
 * 
 * Clase que implementar√° la interfaz Objetiva y se encargar√° de que la antigua funcionalidad obedezca a la misma.
 */
public class Adapter implements ITarget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
