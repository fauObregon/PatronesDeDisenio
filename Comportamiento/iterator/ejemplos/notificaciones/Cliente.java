package iterator.ejemplos.notificaciones;

/**
 * 
 * @author fobregon
 *
 */
public class Cliente {
	
	public static void main(String args[]) { 
        BarraDeNotificacion barraNotificacion = new BarraDeNotificacion(); 
        barraNotificacion.imprimirNotificaciones();
        barraNotificacion.getNotificaciones().adicionarItem("Nueva notificacion");
        System.out.println("\n");
        barraNotificacion.imprimirNotificaciones();
    }
}
