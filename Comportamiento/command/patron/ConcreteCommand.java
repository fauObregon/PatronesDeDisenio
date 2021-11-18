package command.patron;

/**
 * 
 * @author fobregon
 *
 * Comando Concreto: Representan los comandos concretos, éstos deberán heredar de InterfazComando. 
 * Cada una de estas clases representa un comando que podrá ser ejecutado de forma independiente.
 */
public class ConcreteCommand extends Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver) {
        receiver.doAction();
        this.receiver = receiver;
    }

}
