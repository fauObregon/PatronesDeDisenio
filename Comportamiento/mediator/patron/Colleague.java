/**
 * 
 */
package mediator.patron;

/**
 * @author fobregon
 *
 * Colega : Define la interfaz para la comunicación con otros colegas
 */
public interface Colleague {
	
	public void notify(String string);
	public void send(String string);
}
