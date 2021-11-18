package iterator.ejemplos.notificaciones;

/**
 * 
 * @author fobregon
 *
 * AgregadorConcreto (NotificacionColeccion): implementa una interfaz de creación del Iterator para devolver la instancia de IteradorConcreto apropiada.
 */
public class NotificacionColeccion implements Coleccion { 
    
	static final int MAX_ITEMS = 6; 
    int numeroDeItems = 0; 
    Notificacion[] listaNotificacion; 
  
    public NotificacionColeccion() { 
        listaNotificacion = new Notificacion[MAX_ITEMS]; 
  
        // Agregamos algunas notificaciones ficticias 
        adicionarItem("Notificacion Facebook"); 
        adicionarItem("Notificacion Whatsapp"); 
        adicionarItem("Notificacion Twitter"); 
    } 
  
    public void adicionarItem(String informacion) { 
        Notificacion notificacion = new Notificacion(informacion); 
        if (numeroDeItems >= MAX_ITEMS) { 
            System.err.println("Lleno"); 
     	} else { 
            listaNotificacion[numeroDeItems] = notificacion; 
            numeroDeItems = numeroDeItems + 1; 
        } 
    } 
  
    @Override
    public Iterador crearIterador() { 
        return new NotificacionIterador(listaNotificacion); 
    } 

}
