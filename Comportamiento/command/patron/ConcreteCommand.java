package command.patron;

/**
 * 
 * @author fobregon
 *
 * Comando Concreto: Representan los comandos concretos, �stos deber�n heredar de InterfazComando. 
 * Cada una de estas clases representa un comando que podr� ser ejecutado de forma independiente.
 */
public class ConcreteCommand extends Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver) {
        receiver.doAction();
        this.receiver = receiver;
    }

}
