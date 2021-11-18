package observer.ejemplos.subasta;

/**
 * @author fobregon
 * 
 * InterfaceObservador: Interfaces que deben implementar todos los objetos que desean observar los cambios de InterfaceObservador.
 */
public interface Observador {
    public void notificar(Evento evento);
}
