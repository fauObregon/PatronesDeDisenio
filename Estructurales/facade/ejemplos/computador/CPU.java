package facade.ejemplos.computador;

/**
 * @author fobregon
 * 
 * Subsistemas: Conjunto de clases que se necesitan utilizar y a las que se pretende dar un punto de acceso sencillo mediante la fachada.
 */
public class CPU {
    public void enfriar() {
        System.out.println("CPU: Enfriando...");
    }

    public void ejecutar() {
        System.out.println("CPU: Ejecutando...");
    }

}
