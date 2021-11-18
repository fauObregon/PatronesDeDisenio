package command.ejemplos.hechizos;

import java.util.Deque;
import java.util.LinkedList;

import command.ejemplos.hechizos.comandos.Comando;

/**
 * @author fobregon
 * 
 * Invocador: El invocador (Mago) representa la acción que dispara alguno de los comandos.
 */
public class Mago {

    private Deque<Comando> pilaDeshacer = new LinkedList<>();
    private Deque<Comando> pilaRehacer = new LinkedList<>();

    public Mago() {
    }

    public void lanzarHechizo(Comando comando, Objetivo objetivo) {
        System.out.println(this + " laza " + comando + " sobre " + objetivo);
        comando.ejecutar(objetivo);
        pilaDeshacer.offerLast(comando);
    }

    public void deshacerUltimoHechizo() {
        if (!pilaDeshacer.isEmpty()) {
            Comando hechizoAnterior = pilaDeshacer.pollLast();
            pilaRehacer.offerLast(hechizoAnterior);
            System.out.println(this + " deshace " + hechizoAnterior);
            hechizoAnterior.deshacer();
        }
    }

    public void rehacerUltimoHechizo() {
        if (!pilaRehacer.isEmpty()) {
            Comando hechizoAnterior = pilaRehacer.pollLast();
            pilaDeshacer.offerLast(hechizoAnterior);
            System.out.println(this + " rehace " + hechizoAnterior);
            hechizoAnterior.rehacer();
        }
    }

    @Override
    public String toString() {
        return "Mago";
    }

}
