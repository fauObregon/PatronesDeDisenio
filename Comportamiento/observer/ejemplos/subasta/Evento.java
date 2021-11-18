package observer.ejemplos.subasta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fobregon
 * 
 */
public class Evento {

    private int tipo;
    private String descripcion;
    private Date fecha;

    public Evento(){}

    public Evento(int tipo, String descripcion){
        this.setTipo(tipo);
        this.setDescripcion(descripcion);
        this.fecha = new Date();
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int type) {
        this.tipo = type;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String description) {
        this.descripcion = description;
    }

    public String getFecha() {
        DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formatoFecha.format(fecha);
    }
}
