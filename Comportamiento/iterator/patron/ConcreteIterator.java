/**
 * 
 */
package iterator.patron;

/**
 * @author fobregon
 *
 * IteradorConcreto: Implementa la interfaz Iterator y Mantiene la posición actual en el recorrido del agregado
 */

public class ConcreteIterator implements Iterator {
	
	private int[] vector;
	private int position;

	public ConcreteIterator(ConcreteAggregate concreteAggregate) {
		vector = concreteAggregate.vector;
		position = 0;
	}

	@Override
	public Object next() {
		int value = vector[position];
    	position++;
    	return value;
	}

	@Override
	public boolean hasNext() {
		if (position < vector.length) 
        	return true;
        else
			return false;
	}
	
	@Override
	public Object currentItem() {
		return null;
	}

	@Override
	public Object first() {
		return null;
	}

	@Override
	public boolean isDone() {
		return false;
	}
}
