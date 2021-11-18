package facade.ejemplos.banco;

/**
 * @author fobregon
 * 
 * Subsistemas: Conjunto de clases que se necesitan utilizar y a las que se pretende dar un punto de acceso sencillo mediante la fachada.
 */
public class VerificacionCodigoSeguridad {

    private int codigoDeSeguridad = 1234;

    public int getCodigoDeSeguridad() { return codigoDeSeguridad; }

    public boolean esElCodigoCorrecto(int codigoDeSeguridad){

        if(codigoDeSeguridad == getCodigoDeSeguridad()) {
            return true;
        } else {
            return false;
        }
    }
}
