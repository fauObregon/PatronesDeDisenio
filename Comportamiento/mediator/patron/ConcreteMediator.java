/**
 * 
 */
package mediator.patron;

/**
 * @author fobregon
 *
 *  Mediador Concreto: Implementa la interfaz del mediador y coordina la comunicación entre objetos de colega.
 */
public class ConcreteMediator implements Mediator {
	
	private ConcreteColleague1 colega1;
	private ConcreteColleague2 colega2;
	
	public void setColega1(ConcreteColleague1 colega1) {
		this.colega1 = colega1;
	}

	public void setColega2(ConcreteColleague2 colega2) {
		this.colega2 = colega2;
	}

	@Override
	public void send(String texto, Colleague colega) {
		// TODO Auto-generated method stub		
	}
}
