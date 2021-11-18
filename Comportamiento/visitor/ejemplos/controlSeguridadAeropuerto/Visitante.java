/**
 * 
 */
package visitor.ejemplos.controlSeguridadAeropuerto;

/**
 * @author fobregon
 *
 * InterfaceVisitante: Interface que define la estructura del visitante, la interface deberá tener un método por cada objeto que se requiera analizar de la estructura (elemento).
 */
public interface Visitante {
	public boolean visitar(PasajeroNacional pasajero);
    public boolean visitar(PasajeroInternacional pasajero);
    
}