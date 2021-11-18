/**
 * 
 */
package singleton.ejemplos.gobierno;

/**
 * @author fobregon
 *
 */
public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gobierno gobierno1 = Gobierno.getGobierno();
		Gobierno gobierno2 = Gobierno.getGobierno();
		
		if (gobierno1 == gobierno2) {
			System.out.println("Los objetos son la misma instancia");
            System.out.println("    Gobierno 1 hash code: " + System.identityHashCode(gobierno1));
            System.out.println("    Gobierno 2 hash code: " + System.identityHashCode(gobierno2));
		}

	}

}
