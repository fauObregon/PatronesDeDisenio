package adapter.patron;


/**
 * @author fobregon
 * 
 * Clase que implementará la interfaz Objetiva y se encargará de que la antigua funcionalidad obedezca a la misma.
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
