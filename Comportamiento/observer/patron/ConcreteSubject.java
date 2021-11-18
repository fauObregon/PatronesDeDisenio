package observer.patron;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author fobregon
 * 
 * ObservadoConcreto (Subject): Clase que desea ser observada, ésta implementa Observable y debe implementar sus métodos.
 */
public class ConcreteSubject implements Subject {

    private final HashMap<Integer, LinkedList<Observer>> observers;

    public ConcreteSubject(){
        observers = new HashMap<Integer, LinkedList<Observer>>();
    }

    private LinkedList<Observer> getList(int type) {
        if (!observers.containsKey(type)) {
            observers.put(type, new LinkedList<Observer>());
        }
        return observers.get(type);
    }

    @Override
    public void attach(int eventTpye, Observer newObserver) {
        getList(eventTpye).add(newObserver);
    }

    @Override
    public void detach(int eventTpye, Observer observer) {
        getList(eventTpye).remove(observer);
    }

    @Override
    public void notifyObserver(int eventTpye, Event event) {
        if (observers.containsKey(eventTpye)){
            Iterator<Observer> iterator = 
            		observers.get(eventTpye).iterator();
            while(iterator.hasNext()){
                iterator.next().update(event);
            }
        }
    }
}
