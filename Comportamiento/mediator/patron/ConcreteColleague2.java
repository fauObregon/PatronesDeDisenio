/**
 * 
 */
package mediator.patron;

/**
 * @author fobregon
 *
 * Colega Concreto : Implementa la interfaz de colega y se comunica con otros colegas a través de su mediador
 */
public class ConcreteColleague2 implements Colleague {
	
	private Mediator mediator;
	
	public ConcreteColleague2(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void notify(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(String string) {
		mediator.send(string, this);
		
	}

}
