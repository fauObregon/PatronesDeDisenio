package command.patron;

/**
 * 
 * @author fobregon
 * 
 * InterfazComando: Interface que describe la estructura de los comandos, la cual define el método de ejecución genérico para todos los comandos.
 */
public abstract class Command {
    public abstract void execute(Receiver receiver);
}
