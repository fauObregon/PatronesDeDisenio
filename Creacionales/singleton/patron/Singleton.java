package singleton.patron;

/**
 * @author fobregon
 * 
 * Unica: Clase que implementa el patrón Singleton, de la cual únicamente se podrá tener una instancia durante toda la vida de la aplicación.
 */
public class Singleton {

    static Singleton instance;

    private Singleton () {

    }

    /**
    * La instancia se crea solo cuando se llama por primera vez.
    * Carga lenta.
    * De esta manera, singleton es seguro para subprocesos
    * @return
    */
    public synchronized static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;

    }

}
