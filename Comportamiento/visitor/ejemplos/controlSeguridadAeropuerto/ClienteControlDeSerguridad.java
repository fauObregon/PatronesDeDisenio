package visitor.ejemplos.controlSeguridadAeropuerto;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * @author fobregon
 * 
 * Cliente: Componente que interactua con la estructura (element) y con el Visitante, este es responsable de crear los visitantes y enviarlos al elemento para su procesamiento.
 */
public class ClienteControlDeSerguridad {
	
	public static void main(String[] args) { 
		Elemento[] pasajeros = new Elemento[] {
				new PasajeroNacional("45874005H", Arrays.asList("Monedas","Bolso","Gafas de Sol")),
			  new PasajeroNacional(null, Collections.emptyList()),
			  new PasajeroInternacional("4A4585BC", true, Arrays.asList("Gorra","Barba falsa","Pistola")),
			  new PasajeroInternacional("11AB8564", false, Arrays.asList("Maleta","Saco")),
			  new PasajeroInternacional("269LZF74", false, Arrays.asList("Liquidos"))};
		
		OficialDePolicia oficial = new OficialDePolicia();
		
		for(Elemento elemento: pasajeros) {
			if(elemento.aceptar(oficial)) {
				System.out.println("Acceso permitido");
			}else {
				System.out.println("Acceso negado");
			}
		}
	}
}
