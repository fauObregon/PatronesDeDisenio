package adapter.patron;

/**
 * @author fobregon
 * 
 * Se trata de la clase adaptada (o a adaptar).
 * Se trata de una clase existente la cual pretendemos adaptar para que funcione bajo una nueva interfaz.
 * Puede haber varios Adaptados.
 */
public class Adaptee {

    private String name;

    public Adaptee(String name){
        this.name = name;
    }

    public void specificRequest() {
        System.out.println("Called specific request on Adaptee " + name);
    }
}
