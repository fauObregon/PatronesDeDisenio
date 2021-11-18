package command.ejemplos.hechizos.comandos;

import command.ejemplos.hechizos.Objetivo;

/**
 * @author fobregon
 * 
 * Comando Concreto: Representan los comandos concretos, éstos deberán heredar de InterfazComando. 
 * Cada una de estas clases representa un comando que podrá ser ejecutado de forma independiente.
 */
public class HechizoDeEdad extends Comando {

    private Edad edadAnterior;
    private Objetivo objetivo;


    @Override
    public void ejecutar(Objetivo objetivo) {
        edadAnterior = objetivo.getEdad();
        objetivo.setEdad(Edad.ANCIANO);
        this.objetivo = objetivo;
    }

    @Override
    public void deshacer() {
        if (edadAnterior != null && objetivo != null) {
            Edad temporal = objetivo.getEdad();
            objetivo.setEdad(edadAnterior);
            edadAnterior = temporal;
        }
    }

    @Override
    public void rehacer() {
        deshacer();
    }

    @Override
    public String toString() {
        return "Hechizo de Edad";
    }
}
