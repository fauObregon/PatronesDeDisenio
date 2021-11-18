package facade.ejemplos.banco;

/**
 * @author fobregon
 * 
 * Subsistemas: Conjunto de clases que se necesitan utilizar y a las que se pretende dar un punto de acceso sencillo mediante la fachada.
 */
public class VerificacionFondos {

    private double dineroEnLaCuenta = 1000.00;

    public double getDineroEnLaCuenta() { return dineroEnLaCuenta; }

    public void disminuirDineroEnCuenta(double efectivoRetidado) { dineroEnLaCuenta -= efectivoRetidado; }

    public void incrementarDineroEnCuenta(double efectivoDepositado) { dineroEnLaCuenta += efectivoDepositado; }

    public boolean tengoSuficienteDinero(double dineroARetirar) {

        if(dineroARetirar > getDineroEnLaCuenta()) {
            System.out.println("Error: no tienes suficiente dinero");
            System.out.println("Saldo actual: " + getDineroEnLaCuenta());
            return false;
        } else {
            disminuirDineroEnCuenta(dineroARetirar);
            System.out.println("Retiro Completo: el saldo actual es " + getDineroEnLaCuenta());
            return true;
        }

    }

    public void hacerDeposito(double dineroADepositar) {
        incrementarDineroEnCuenta(dineroADepositar);
        System.out.println("Deposito Completo: el saldo actual es " + getDineroEnLaCuenta());

    }

}
