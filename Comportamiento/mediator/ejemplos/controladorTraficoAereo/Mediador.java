/**
 * 
 */
package mediator.ejemplos.controladorTraficoAereo;

/**
 * @author fobregon
 *
 * Mediador : Define la interfaz para la comunicación entre objetos de colega.
 */
public interface Mediador {
	
	public void registrarPista(Pista pista); 
	  
    public void registrarVuelo(Vuelo Vuelo); 
  
    public boolean estaAterrizandoBien(); 
  
    public void establecerEstadoDeAterrizaje(boolean estado); 

}
