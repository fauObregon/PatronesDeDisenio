package facade.ejemplos.banco;

/**
 * @author fobregon
 */
public class Cliente {

    public static void main(String[] args) {

        FachadaBanco accesoABanco = new FachadaBanco(1234567890, 1234);

        accesoABanco.retirarDinero(50.00);
        accesoABanco.retirarDinero(900.00);
        accesoABanco.depositarDinero(200.00);

        accesoABanco.retirarDinero(900.00);

    }
}
