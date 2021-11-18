/**
 * 
 */
package visitor.patron;

/**
 * @author fobregon
 * 
 * ElementoConcreto: Representa un hijo de la estructura compuesta, 
 * la estructura completa puede estar compuesta de un gran número de estos objetos y cada uno deberá implementar el método accept.
 */
public class ConcreteElementB implements Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
		
	}

}
