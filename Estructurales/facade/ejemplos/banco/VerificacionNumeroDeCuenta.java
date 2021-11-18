package facade.ejemplos.banco;

/**
 * @author fobregon
 * 
 * Subsistemas: Conjunto de clases que se necesitan utilizar y a las que se pretende dar un punto de acceso sencillo mediante la fachada.
 */
public class VerificacionNumeroDeCuenta {

    private int numeroDeCuenta = 1234567890;

    public int getNumeroDeCuenta() { return numeroDeCuenta; }

    public boolean esCuentaActiva(int numeroDeCuentaAVerificar){
        if(numeroDeCuentaAVerificar == getNumeroDeCuenta()) {
            return true;
        } else {
            return false;
        }
    }
}
