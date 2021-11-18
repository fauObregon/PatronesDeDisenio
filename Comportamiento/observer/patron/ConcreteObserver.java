package observer.patron;

/**
 * @author fobregon
 * 
 * ObservadorConcreto: Clase concreta que está atenta de los cambios de InterfaceObservador, esta clase hereda de IObserver y debe de implementar sus métodos.
 */
public class ConcreteObserver implements Observer {

    private static int ID = 0;

    @Override
    public void update(Event event) {
        System.out.println(
                "ID: " + (++ID) +
                ", Updating event type: " +  event.getTipo() +
                ", Event description: " + event.getDescripcion());
    }
}
