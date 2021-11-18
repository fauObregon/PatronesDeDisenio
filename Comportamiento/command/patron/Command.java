package command.patron;

/**
 * 
 * @author fobregon
 * 
 * InterfazComando: Interface que describe la estructura de los comandos, la cual define el m�todo de ejecuci�n gen�rico para todos los comandos.
 */
public abstract class Command {
    public abstract void execute(Receiver receiver);
}
