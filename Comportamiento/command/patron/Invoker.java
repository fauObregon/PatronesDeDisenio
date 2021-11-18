package command.patron;


/**
 * 
 * @author fobregon
 * 
 * Invocador: El invocador representa la acción que dispara alguno de los comandos.
 */
public class Invoker {
    public void executeCommand(Command command, Receiver receiver){
        command.execute(receiver);
    }
}
