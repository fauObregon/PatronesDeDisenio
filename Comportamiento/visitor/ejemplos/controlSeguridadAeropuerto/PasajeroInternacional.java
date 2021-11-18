package visitor.ejemplos.controlSeguridadAeropuerto;

import java.util.List;

/**
 * 
 * @author fobregon
 * 
 * ElementoConcreto: Representa un hijo de la estructura compuesta, 
 * la estructura completa puede estar compuesta de un gran número de estos objetos y cada uno deberá implementar el método accept.
 */
public class PasajeroInternacional implements Elemento{
	private String pasaporte;
	private Boolean visa;
	private List<String> pertenencias;
	
	public PasajeroInternacional(String pasaporte, Boolean visa, List<String> pertenencias) {
		this.pasaporte = pasaporte;
		this.visa = visa;
		this.pertenencias = pertenencias;
	}

	public String getPasaporte() {
		return pasaporte;
	}
	
	public Boolean getVisa() {
		return visa;
	}

	public List<String> getPertenencias() {
		return pertenencias;
	}

	@Override
    public boolean aceptar(OficialDePolicia visitor) { 
        return visitor.visitar(this); 
    }
}
