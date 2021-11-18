package observer.ejemplos.subasta;


/**
 * @author fobregon
 * 
 * ObservadorConcreto: Clase concreta que está atenta de los cambios de InterfaceObservador, esta clase hereda de Observer (observador) y debe de implementar sus métodos.
 * 
 */
public class Postor implements Observador {

    private static int ID = 0;

    @Override
    public void notificar(Evento evento) {
        System.out.println(
                "ID: " + (++ID) +
                        ", Actualizacion del tipo de evento:: " +  evento.getTipo() +
                        ", Descripcion del Evento: " + evento.getDescripcion());
    }
}
