package proxy.patron;

/**
 * 
 * @author fobregon
 *
 * Apoderada (Proxy): 
 * Mantiene una referencia al objeto real adem�s de implementar la interfaz Tema (Subject). 
 * El cliente trabajar� con este objeto como si fuese el objeto real.
 */
public class Proxy implements ISubject {

    private ISubject wrapee;

    public Proxy(ISubject wrapee){
        this.wrapee = wrapee;
    }

    @Override
    public void doService() {
        anotherFunctionality();
        if(wrapee == null){
            wrapee = new RealSubject(); //Solo para este ejemplo de patr�n
        }
        wrapee.doService();
    }

    private void anotherFunctionality() {
        System.out.println("Haciendo otra funcionalidad desde Proxy...");
    }

}
