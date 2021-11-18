package iterator.ejemplos.notificaciones;

/**
 * 
 * @author fobregon
 *
 */
public class BarraDeNotificacion {
	private NotificacionColeccion notificaciones; 
	  
    public BarraDeNotificacion() { 
        this.notificaciones = new NotificacionColeccion(); 
    } 
  
    public void imprimirNotificaciones() { 
        Iterador iterador = notificaciones.crearIterador(); 
        System.out.println("-------BARRA DE NOTIFICACIONES------------"); 
        while (iterador.hayMas()) { 
            Notificacion notificacion = (Notificacion)iterador.siguiente(); 
            System.out.println(notificacion.getNotificacion()); 
        } 
    }
    
    public NotificacionColeccion getNotificaciones() {
    	return this.notificaciones;
    }
}
