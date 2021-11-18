package observer.patron;

/**
 * @author fobregon
 * 
 * InterfaceObservado (Subject): Interface que deben de implementar todos los objetos que quieren ser observados, en ella se definen los métodos mínimos que se deben implementar.
 */
public interface Subject {

    public void attach(int eventTpye, Observer newObserver);
    public void detach(int eventTpye, Observer observer);
    public void notifyObserver(int eventTpye, Event event);

}
