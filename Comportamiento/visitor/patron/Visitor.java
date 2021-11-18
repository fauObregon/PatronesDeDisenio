/**
 * 
 */
package visitor.patron;

/**
 * @author fobregon
 * 
 * InterfaceVisitante: Interface que define la estructura del visitante, la interface deber� tener un m�todo por cada objeto que se requiera analizar de la estructura (elemento).
 */
public interface Visitor {
	
	public void visitConcreteElementA(ConcreteElementA concreteElementA);
	public void visitConcreteElementB(ConcreteElementB concreteElementB);
}
