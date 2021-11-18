package command.patron;

/**
 * @author fobregon
 * 
 * RecibidorConcreto: el cual ejecuta el código correcto para el comando recibido.
 */
public class ConcreteReceiver extends Receiver {

    @Override
    public void doAction() {
        System.out.println("Accion sobre el CONCRETE receiver");
    }
}
