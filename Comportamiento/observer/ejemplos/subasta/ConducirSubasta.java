package observer.ejemplos.subasta;

/**
 * @author fobregon
 * 
 */
public class ConducirSubasta {

    public static void main(String[] args) {

        Sujeto elSubastador = new Subastador();

        Observador postorUno = new Postor();
        Observador postorDos = new Postor();
        Observador postorTres = new Postor();

        elSubastador.adjuntar(0, postorUno);
        elSubastador.adjuntar(0, postorDos);
        elSubastador.adjuntar(0, postorTres);

        elSubastador.adjuntar(1, postorTres);

        Evento ofertaAlta = new Evento(0, "OFERTA ALTA");
        Evento ofertaBaja = new Evento(1, "OFERTA BAJA");

        elSubastador.notificarAlObservador(0, ofertaAlta);
        elSubastador.notificarAlObservador(1, ofertaBaja);

    }
}
