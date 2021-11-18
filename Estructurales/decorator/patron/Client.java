package decorator.patron;

/**
 * 
 * @author fobregon
 * 
 * Necesitamos a�adir responsabilidades a objetos individuales de forma din�mica y transparente 
 * Se pueden revocar responsabilidades antes asignadas a nuestros objetos.
 * La extensi�n mediante herencia viola los principios SOLID.
 * Necesitamos extender la funcionalidad de una clase pero la herencia no es una soluci�n viable.
 * Necesitamos extender la funcionalidad de un objeto en tiempo de ejecuci�n e incluso eliminarla si fuera necesario.
 * 
 * Ventajas: M�s flexibilidad que la herencia est�tica.
 * Evita que las clases de arriba de la jerarqu�a est�n repletas de funcionalidades. 
 * En vez de definir una clase compleja que trata de dar cabida a todas ellas, la funcionalidad se logra a�adiendo decoradores a una clase simple.
 * 
 * Desventajas: Un decorador y sus componentes no son id�nticos, desde el punto de vista de la identidad de objetos, 
 * desde el punto de vista del programador o del cliente si que se podr�an considerar iguales.
 * Muchos objetos peque�os. El sistema puede ser m�s dif�cil de aprender y de depurar.
 *
 */
public class Client {

    public static void main(String[] args) {

        IComponent iComponent = new ConcreteDecoratorOne(new ConcreteComponent());
        iComponent.doOperation();
        System.out.println("Adding concrete component two...");
        iComponent = new ConcreteDecoratorOne(new ConcreteDecoratorTwo(new ConcreteComponent()));
        iComponent.doOperation();
    }

}
