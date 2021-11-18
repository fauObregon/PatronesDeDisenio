package command.ejemplos.hechizos.comandos;

import command.ejemplos.hechizos.Objetivo;

/**
 * 
 * @author fobregon
 *
 * Comando Concreto: Representan los comandos concretos, éstos deberán heredar de InterfazComando. 
 * Cada una de estas clases representa un comando que podrá ser ejecutado de forma independiente.
 */
public class HechizoDeInvisibilidad extends Comando {

    private Objetivo objetivo;

    @Override
    public void ejecutar(Objetivo objetivo) {
        objetivo.setVisibilidad(Visibilidad.INVISIBLE);
        this.objetivo = objetivo;
    }

    @Override
    public void deshacer() {
        if (objetivo != null) {
            objetivo.setVisibilidad(Visibilidad.VISIBLE);
        }
    }

    @Override
    public void rehacer() {
        if (objetivo != null) {
            objetivo.setVisibilidad(Visibilidad.INVISIBLE);
        }
    }

    @Override
    public String toString() {
        return "Hechizo de Invisibilidad";
    }
}
