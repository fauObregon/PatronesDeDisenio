/**
 * 
 */
package iterator.patron;

/**
 * @author fobregon
 *
 * Permite variaciones en el recorrido de un agregado Para cambiar el algoritmo de recorrido basta cambiar la instancia de Iterator concreta
 * Nuevos recorridos mediante nuevas subclases de Iterator
 * Los iteradores simplifican la interfaz del contenedor
 * Puede hacerse más de un recorrido a la vez sobre un mismo agregado
 */
public class Client {

	public static void main(String[] args) {
		Aggregate vector = new ConcreteAggregate(7);
		
		Iterator iterator = vector.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
