/**
 * 
 */
package visitor.patron;

/**
 * @author fobregon
 * 
 * ElementoConcreto: Representa un hijo de la estructura compuesta, 
 * la estructura completa puede estar compuesta de un gran n�mero de estos objetos y cada uno deber� implementar el m�todo accept.
 */
public class ConcreteElementB implements Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
		
	}

}
