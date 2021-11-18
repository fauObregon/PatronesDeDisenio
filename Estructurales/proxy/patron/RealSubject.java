package proxy.patron;

/**
 * 
 * @author fobregon
 * 
 * RealSubject: Objeto real que implementa la funcionalidad definida por la interfaz Subject.
 *
 */
public class RealSubject implements ISubject{
    @Override
    public void doService() {
        System.out.println("Sujeto real haciendo servicio...");
    }
}
