package mediator.ejemplos.controladorTraficoAereo;

/**
 * 
 * @author fobregon
 * 
 * Components: Componentes que son parte de la red de comunicación por medio del mediador, éstos pueden ser diversos objetos que comparten el mismo mediador para comunicarse.
 */
public class Pista implements Colega { 
    private Mediador mediador; 
  
    public Pista(Mediador mediador) { 
        this.mediador = mediador; 
        mediador.establecerEstadoDeAterrizaje(false); 
    } 
  
    @Override
    public void aterrizar() { 
        System.out.println("Permiso de aterrizaje otorgado."); 
        mediador.establecerEstadoDeAterrizaje(true); 
    } 
}