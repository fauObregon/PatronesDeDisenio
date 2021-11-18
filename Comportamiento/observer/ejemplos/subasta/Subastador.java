package observer.ejemplos.subasta;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author fobregon
 * 
 * ObservadoConcreto (ConcreteSubject): Clase que desea ser observada, ésta implementa IObservable (Sujeto) y debe implementar sus métodos.
 */
public class Subastador implements Sujeto{

    private final HashMap<Integer, LinkedList<Observador>> postores;

    public Subastador(){
        postores = new HashMap<Integer, LinkedList<Observador>>();
    }

    private LinkedList<Observador> obtenerLista(int tipo) {
        if (!postores.containsKey(tipo)) {
            postores.put(tipo, new LinkedList<Observador>());
        }
        return postores.get(tipo);
    }

    @Override
    public void adjuntar(int tipoEvento, Observador nuevoObservador) {
        obtenerLista(tipoEvento).add(nuevoObservador);
    }

    @Override
    public void quitar(int tipoEvento, Observador observador) {
        obtenerLista(tipoEvento).remove(observador);
    }

    @Override
    public void notificarAlObservador(int tipoEvento, Evento evento) {
        if (postores.containsKey(tipoEvento)){
            Iterator<Observador> iterator = postores.get(tipoEvento).iterator();
            while(iterator.hasNext()){
                iterator.next().notificar(evento);
            }
        }
    }

}
