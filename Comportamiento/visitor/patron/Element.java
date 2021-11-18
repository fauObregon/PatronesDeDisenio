package visitor.patron;

/**
 * 
 * @author fobregon
 * 
 * Elemento: Representa la ra�z de la estructura, en forma de �rbol, sobre la que utilizaremos el Visitante. 
 * Este objeto por lo general es una interface que define el m�todo accept y deber�n implementar todos los objetos de la estructura.
 */
public interface Element {
	public void accept(Visitor visitor);
}
