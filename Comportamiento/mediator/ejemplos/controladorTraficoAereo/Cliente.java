package mediator.ejemplos.controladorTraficoAereo;


/**
 * 
 * @author fobregon
 *
 * Cliente: Componente que inicia la comunicación con el resto de los componentes por medio del mediador.
 */
public class Cliente {
	
	public static void main(String args[]) { 
  
        TorreDeControl mediador = new TorreDeControl(); 
        
        Vuelo avianca = new Vuelo(mediador); 
        Pista pistaPrincipal = new Pista(mediador);
        
        mediador.registrarVuelo(avianca); 
        mediador.registrarPista(pistaPrincipal);
        
        avianca.prepararse();
        
        pistaPrincipal.aterrizar(); 
        avianca.aterrizar();
    }
}