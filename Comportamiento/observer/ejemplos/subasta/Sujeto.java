package observer.ejemplos.subasta;

/**
 * @author fobregon
 * 
 * InterfaceObservado (Subject): Interface que deben de implementar todos los objetos que quieren ser observados, en ella se definen los m�todos m�nimos que se deben implementar.
 */
public interface Sujeto {

    public void adjuntar(int tipoEvento, Observador newObservador);
    public void quitar(int tipoEvento, Observador observador);
    public void notificarAlObservador(int tipoEvento, Evento evento);

}
