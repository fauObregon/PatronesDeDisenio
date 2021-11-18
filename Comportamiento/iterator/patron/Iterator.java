/**
 * 
 */
package iterator.patron;

/**
 * @author fobregon
 *
 * Iterador: define interfaz para acceder y recorrer elementos
 */
public interface Iterator {
	
	public Object currentItem();
	
	public Object first();
	
	public boolean isDone();
	
	public Object next();
	
	public boolean hasNext();

}
