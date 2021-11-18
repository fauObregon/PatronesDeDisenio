package command.ejemplos.hechizos.comandos;

import command.ejemplos.hechizos.Objetivo;

/**
 * @author fobregon
 * 
 * InterfazComando: Interface que describe la estructura de los comandos, la cual define el método de ejecución genérico para todos los comandos.
 */
public abstract class Comando {

    public abstract void ejecutar(Objetivo objetivo);
    public abstract void deshacer();
    public abstract void rehacer();

    @Override
    public abstract String toString();

}
