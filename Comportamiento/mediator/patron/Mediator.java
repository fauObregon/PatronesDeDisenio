/**
 * 
 */
package mediator.patron;

/**
 * @author fobregon
 *
 * Mediador : Define la interfaz para la comunicación entre objetos de colega.
 */
public interface Mediator {
	
	public void send(String texto, Colleague colega);

}
