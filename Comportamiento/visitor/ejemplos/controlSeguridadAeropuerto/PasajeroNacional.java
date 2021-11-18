package visitor.ejemplos.controlSeguridadAeropuerto;

import java.util.List;


/**
 * 
 * @author fobregon
 * 
 * ElementoConcreto: Representa un hijo de la estructura compuesta, 
 * la estructura completa puede estar compuesta de un gran n�mero de estos objetos y cada uno deber� implementar el m�todo accept.
 */
public class PasajeroNacional implements Elemento{
	private String documentoDeIdentidad;
	private List<String> pertenencias;
	
	public PasajeroNacional(String documentoDeIdentidad, List<String> pertenencias) {
		this.documentoDeIdentidad = documentoDeIdentidad;
		this.pertenencias = pertenencias;
	}

	public String getDocumentoDeIdentidad() {
		return documentoDeIdentidad;
	}


	public List<String> getPertenencias() {
		return pertenencias;
	}

	@Override
    public boolean aceptar(OficialDePolicia visitante) { 
        return visitante.visitar(this); 
    }
}