package command.ejemplos.hechizos;

import command.ejemplos.hechizos.comandos.HechizoDeEdad;
import command.ejemplos.hechizos.comandos.HechizoDeEstatura;
import command.ejemplos.hechizos.comandos.HechizoDeInvisibilidad;

/**
 * @author fobregon
 * 
 */
public class ActoMagico {

    public static void main(String[] args) {
        Mago mago = new Mago();
        Asistente asistente = new Asistente();

        asistente.presentarEstado();

        mago.lanzarHechizo(new HechizoDeEstatura(), asistente);
        asistente.presentarEstado();

        mago.lanzarHechizo(new HechizoDeInvisibilidad(), asistente);
        asistente.presentarEstado();

        mago.deshacerUltimoHechizo();
        asistente.presentarEstado();

        mago.deshacerUltimoHechizo();
        asistente.presentarEstado();

        mago.rehacerUltimoHechizo();
        asistente.presentarEstado();

        mago.rehacerUltimoHechizo();
        asistente.presentarEstado();

        ///Agregar un nuevo hechizo
        mago.lanzarHechizo(new HechizoDeEdad(), asistente);
        asistente.presentarEstado();
    }

}
