package command.ejemplos.hechizos.comandos;

import command.ejemplos.hechizos.Objetivo;

/**
 * @author fobregon
 * 
 * Comando Concreto: Representan los comandos concretos, éstos deberán heredar de InterfazComando. 
 * Cada una de estas clases representa un comando que podrá ser ejecutado de forma independiente.
 */
public class HechizoDeEstatura extends Comando {

    private Tamanio tamanioAnterior;
    private Objetivo objetivo;

    @Override
    public void ejecutar(Objetivo objetivo) {
        tamanioAnterior = objetivo.getTamanio();
        objetivo.setTamanio(Tamanio.PEQUENIO);
        this.objetivo = objetivo;
    }

    @Override
    public void deshacer() {
        if (tamanioAnterior != null && objetivo != null) {
            Tamanio temporal = objetivo.getTamanio();
            objetivo.setTamanio(tamanioAnterior);
            tamanioAnterior = temporal;
        }
    }

    @Override
    public void rehacer() {
        deshacer();
    }

    @Override
    public String toString() {
        return "Hechizo de Estatura";
    }
}
