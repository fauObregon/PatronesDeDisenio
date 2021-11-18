package decorator.patron;

/**
 * 
 * @author fobregon
 * 
 * Necesitamos añadir responsabilidades a objetos individuales de forma dinámica y transparente 
 * Se pueden revocar responsabilidades antes asignadas a nuestros objetos.
 * La extensión mediante herencia viola los principios SOLID.
 * Necesitamos extender la funcionalidad de una clase pero la herencia no es una solución viable.
 * Necesitamos extender la funcionalidad de un objeto en tiempo de ejecución e incluso eliminarla si fuera necesario.
 * 
 * Ventajas: Más flexibilidad que la herencia estática.
 * Evita que las clases de arriba de la jerarquía estén repletas de funcionalidades. 
 * En vez de definir una clase compleja que trata de dar cabida a todas ellas, la funcionalidad se logra añadiendo decoradores a una clase simple.
 * 
 * Desventajas: Un decorador y sus componentes no son idénticos, desde el punto de vista de la identidad de objetos, 
 * desde el punto de vista del programador o del cliente si que se podrían considerar iguales.
 * Muchos objetos pequeños. El sistema puede ser más difícil de aprender y de depurar.
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
