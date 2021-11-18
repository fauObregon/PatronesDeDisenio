package singleton.ejemplos.gobierno;

/**
 * @author fobregon
 * 
 * Gobierno (Singleton): Clase que implementa el patrón Singleton, de la cual únicamente se podrá tener una instancia durante toda la vida de la aplicación.
 */
public class Gobierno {

    static Gobierno gobierno;

    private Gobierno () { }

    public synchronized static Gobierno getGobierno(){
        if(gobierno == null){
            gobierno = new Gobierno();
        }
        return gobierno;

    }

}
