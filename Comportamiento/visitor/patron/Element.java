package visitor.patron;

/**
 * 
 * @author fobregon
 * 
 * Elemento: Representa la raíz de la estructura, en forma de árbol, sobre la que utilizaremos el Visitante. 
 * Este objeto por lo general es una interface que define el método accept y deberán implementar todos los objetos de la estructura.
 */
public interface Element {
	public void accept(Visitor visitor);
}
