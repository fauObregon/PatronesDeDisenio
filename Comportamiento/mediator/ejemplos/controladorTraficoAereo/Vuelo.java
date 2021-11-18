package mediator.ejemplos.controladorTraficoAereo;

/**
 * 
 * @author fobregon
 * 
 * Components: Componentes que son parte de la red de comunicación por medio del mediador, éstos pueden ser diversos objetos que comparten el mismo mediador para comunicarse.
 */
public class Vuelo implements Colega {
    private Mediador mediador; 
  
    public Vuelo(Mediador mediador) { 
        this.mediador = mediador; 
    } 
  
    public void aterrizar() { 
        if (mediador.estaAterrizandoBien()) { 
            System.out.println("Aterrizaje éxitoso"); 
            mediador.establecerEstadoDeAterrizaje(true); 
        
        } else {
            System.out.println("A la espera de aterrizaje.");
        }
    } 
  
    public void prepararse() { 
        System.out.println("Listo para el aterrizaje."); 
    }
}