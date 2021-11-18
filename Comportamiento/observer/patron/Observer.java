package observer.patron;

/**
 * @author fobregon
 * 
 * InterfaceObservador: Interfaces que deben implementar todos los objetos que desean observar los cambios de InterfaceObservador.
 */
public interface Observer {
    public void update(Event event);
}
