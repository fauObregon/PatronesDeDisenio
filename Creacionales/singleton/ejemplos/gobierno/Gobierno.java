package singleton.ejemplos.gobierno;

/**
 * @author fobregon
 * 
 * Gobierno (Singleton): Clase que implementa el patr�n Singleton, de la cual �nicamente se podr� tener una instancia durante toda la vida de la aplicaci�n.
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
