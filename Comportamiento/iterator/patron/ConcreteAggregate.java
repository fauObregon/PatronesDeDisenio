/**
 * 
 */
package iterator.patron;

/**
 * @author fobregon
 *
 * AgregadorConcreto: implementa una interfaz de creación del Iterator para devolver la instancia de IteradorConcreto apropiada.
 */
public class ConcreteAggregate implements Aggregate {
	
	protected int[] vector;
	
	public ConcreteAggregate(int size) {
		vector = new int[size];
        for (int i = 0; i < vector.length; i++){
            vector[i] = i; 
        }
	}
	
	public int getValue(int position) {
		return vector[position];
	}
	
	public void setValue(int position, int value) {
		vector[position] = value;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

}
