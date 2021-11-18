package proxy.patron;

/**
 * 
 * @author fobregon
 * 
 * Cliente: precisa de los servicios de Tema (Subject) aunque trabaja con una referencia Apoderada (Proxy).
 */
public class Client {

    public static void main(String[] args) {

        ISubject proxyToRealSubject = new Proxy(new RealSubject());
        proxyToRealSubject.doService();

    }

}
