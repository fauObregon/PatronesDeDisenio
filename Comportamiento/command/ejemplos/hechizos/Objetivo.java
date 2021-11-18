package command.ejemplos.hechizos;

import command.ejemplos.hechizos.comandos.Edad;
import command.ejemplos.hechizos.comandos.Tamanio;
import command.ejemplos.hechizos.comandos.Visibilidad;

/**
 * 
 * @author fobregon
 * 
 * Receiver: el cual ejecuta el código correcto para el comando recibido.
 *
 */
public abstract class Objetivo {

    private Tamanio tamanio;
    private Visibilidad visibilidad;
    private Edad edad;

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Visibilidad getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(Visibilidad visibilidad) {
        this.visibilidad = visibilidad;
    }

    public Edad getEdad() {
        return edad;
    }

    public void setEdad(Edad edad) {
        this.edad = edad;
    }

    @Override
    public abstract String toString();

    public void presentarEstado() {
        System.out.println(String.format("%s, Tamaño: %s | Visibilidad: %s | Edad: %s \n", this,
                getTamanio(), getVisibilidad(), getEdad()));
    }

}
