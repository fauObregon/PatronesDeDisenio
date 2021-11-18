package iterator.ejemplos.notificaciones;


/**
 * @author fobregon
 *
 * IteradorConcreto (NotificacionIterador): Implementa la interfaz Iterator y Mantiene la posición actual en el recorrido del agregado
 */
public class NotificacionIterador implements Iterador { 
    Notificacion[] listaNotificacion; 
  
    int posicion = 0; 
  
    public  NotificacionIterador (Notificacion[] listaNotificacion) { 
        this.listaNotificacion = listaNotificacion; 
    } 
  
    public Object siguiente() { 
        Notificacion notificacion =  listaNotificacion[posicion]; 
        posicion += 1; 
        return notificacion; 
    } 
  
    public boolean hayMas() { 
        if (posicion >= listaNotificacion.length || 
            listaNotificacion[posicion] == null) {
            return false; 
        } else {
            return true;
        }
    }
}
