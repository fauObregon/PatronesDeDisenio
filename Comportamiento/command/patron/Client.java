package command.patron;

/**
 * 
 * @author fobregon
 *
 * ManejadorComando: Este componente nos servirá para administrar los comandos que tenemos disponibles en tiempo de ejecución, 
 * desde aquí podemos solicitar los comandos o registrar nuevos.
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        ConcreteReceiver receiver = new ConcreteReceiver();

        invoker.executeCommand(new ConcreteCommand(), receiver);
    }
}
