package strategy.ejemplos.transportacion;

/**
 * @author fobregon
 * 
 * Contexto (Viajero): 
 * Componente que encapsula la estrategia a utilizar, 
 * tiene como característica que se puede establecer la estrategia a utilizar en tiempo de ejecución.
 */
public class Viajero {

    private String nombre;
    private ModoDeTransporte modoDeTransporte;

    public Viajero(){}

    public Viajero(String nombre){
        this.setNombre(nombre);
    }

    public void setModoDeTransporte(ModoDeTransporte modoDeTransporte){
        this.modoDeTransporte = modoDeTransporte;
    }

    public ModoDeTransporte getModoDeTransporte(){
        return modoDeTransporte;
    }

    public void viajarAlAeropuerto(){
        System.out.println(this.toString() + getModoDeTransporte().viajar());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Soy " + getNombre() + ". ";
    }
}
