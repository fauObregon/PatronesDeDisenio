package visitor.ejemplos.controlSeguridadAeropuerto;

import java.util.List;

/**
 * 
 * @author fobregon
 * 
 * VisitanteConcreto: Representa una implementación del visitante, esta implementación puede realizar una operación sobre el element. 
 * Es posible tener todos los VisitanteConcreto necesarios para realizar las operaciones que necesitemos.
 */
public class OficialDePolicia implements Visitante {
	
	public boolean visitar(PasajeroNacional pasajero) { 
        boolean checked=false;
        if(verificarIdentificacion(pasajero.getDocumentoDeIdentidad()) && verificarPertenencias(pasajero.getPertenencias())) { 
        	checked=true;
        }
        
        return checked; 
    } 
   
	private boolean verificarIdentificacion(String id) {
		return id!=null && !id.equals("");
	}
	
	private boolean verificarPertenencias(List<String> pertenencias) {
		return !pertenencias.contains("Liquidos");
	}
	
    public boolean visitar(PasajeroInternacional passenger) { 
    	boolean checked=false;
        if(verificarIdentificacion(passenger.getPasaporte()) && verificarPertenencias(passenger.getPertenencias()) && passenger.getVisa()) { 
        	checked=true;
        }
        return checked; 
    }
}
