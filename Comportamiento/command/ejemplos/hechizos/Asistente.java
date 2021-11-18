package command.ejemplos.hechizos;

import command.ejemplos.hechizos.comandos.Edad;
import command.ejemplos.hechizos.comandos.Tamanio;
import command.ejemplos.hechizos.comandos.Visibilidad;

/**
 * @author fobregon
 * 
 * Receiver: el cual ejecuta el código correcto para el comando recibido.
 */
public class Asistente extends Objetivo {

    public Asistente() {
        setTamanio(Tamanio.NORMAL);
        setVisibilidad(Visibilidad.VISIBLE);
        setEdad(Edad.ADULTO);
    }

    @Override
    public String toString() {
        return "Asistente";
    }

}