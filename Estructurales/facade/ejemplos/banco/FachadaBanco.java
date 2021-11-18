package facade.ejemplos.banco;

/**
 * @author fobregon
 * 
 * Fachada: Clase que trata de ofrecer la funcionalidad que demanda el cliente mediante una interfaz sencilla donde, internamente, utiliza las clases subsistemas.
 */
public class FachadaBanco {

    private int numeroDeCuenta;
    private int condigoDeSeguridad;

    private VerificacionNumeroDeCuenta verificadorDeCuenta;
    private VerificacionCodigoSeguridad verificadorDeCondigo;
    private VerificacionFondos verificadorDeFondos;

    private MensajeDeBienvenida mensajeBienvenida;

    public FachadaBanco(int numeroDeCuenta, int codigoDeSeguridad){

        this.numeroDeCuenta = numeroDeCuenta;
        this.condigoDeSeguridad  = codigoDeSeguridad;

        mensajeBienvenida    = new MensajeDeBienvenida();
        verificadorDeCuenta = new VerificacionNumeroDeCuenta();
        verificadorDeCondigo    = new VerificacionCodigoSeguridad();
        verificadorDeFondos   = new VerificacionFondos();

    }

    private int getNumeroDeCuenta() { return numeroDeCuenta; }

    private int getCodigoDeSeguridad() { return condigoDeSeguridad; }

    public void retirarDinero(double candidadEnEfectivo){

        if(puedeRetirar(candidadEnEfectivo)) {
            System.out.println("Transaccion Completa\n");
        } else {
            System.out.println("Transaccion Fallida\n");
        }

    }


    public void depositarDinero(double candidadEnEfectivo){
        if(puesDepositar(candidadEnEfectivo)) {
            verificadorDeFondos.hacerDeposito(candidadEnEfectivo);
            System.out.println("Transaccion Completa\n");
        } else {
            System.out.println("Transaccion Fallidad\n");
        }
    }

    private boolean puedeRetirar(double candidadEnEfectivo){
        return verificadorDeCuenta.esCuentaActiva(getNumeroDeCuenta()) &&
                verificadorDeCondigo.esElCodigoCorrecto(getCodigoDeSeguridad()) &&
                verificadorDeFondos.tengoSuficienteDinero(candidadEnEfectivo);
    }

    private boolean puesDepositar(double candidadEnEfectivo){
        return verificadorDeCuenta.esCuentaActiva(getNumeroDeCuenta()) &&
                verificadorDeCondigo.esElCodigoCorrecto(getCodigoDeSeguridad());
    }

}
