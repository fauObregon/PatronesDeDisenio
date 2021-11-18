package mediator.ejemplos.controladorTraficoAereo;

/**
 * 
 * @author fobregon
 *
 *	Mediador: Componente que sirve de mediador entre el resto de componentes, tiene como principal rol canalizar los mensajes entrantes al destinatario correspondiente.
 */
public class TorreDeControl implements Mediador{
	private Vuelo vuelo; 
    private Pista pista; 
    private boolean enTierra; 
  
    public void registrarPista(Pista pista) { 
        this.pista = pista; 
    } 
  
    public void registrarVuelo(Vuelo vuelo) { 
        this.vuelo = vuelo; 
    } 
  
    public boolean estaAterrizandoBien() { 
        return enTierra; 
    } 
  
    public void establecerEstadoDeAterrizaje(boolean estado) { 
        enTierra = estado; 
    }
}