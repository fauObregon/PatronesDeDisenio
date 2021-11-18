package observer.patron;

/**
 * @author fobregon
 */

public class Test {

    public static void main(String[] args) {

        Subject concreteSubject = new ConcreteSubject();

        Observer concreteObserverOne = new ConcreteObserver();
        Observer concreteObserverTwo = new ConcreteObserver();
        Observer concreteObserverThree = new ConcreteObserver();

        concreteSubject.attach(0, concreteObserverOne);
        concreteSubject.attach(0, concreteObserverTwo);
        concreteSubject.attach(1, concreteObserverOne);
        concreteSubject.attach(1, concreteObserverThree);
        concreteSubject.attach(2, concreteObserverTwo);
        concreteSubject.attach(3, concreteObserverThree);

        Event mainEvent = new Event(0, "Evento Principal: ");
        Event firstEvent = new Event(1, "Primer Evento: ");
        Event secondEvent = new Event(2, "Segundo Evento: ");
        Event thirdEvent = new Event(3, "Tercer Evento: ");

        concreteSubject.notifyObserver(0, mainEvent);
        concreteSubject.notifyObserver(1, firstEvent);
        concreteSubject.notifyObserver(2, secondEvent);
        concreteSubject.notifyObserver(3, thirdEvent);
    }
}
