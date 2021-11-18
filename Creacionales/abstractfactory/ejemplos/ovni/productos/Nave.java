package abstractfactory.ejemplos.ovni.productos;

import abstractfactory.ejemplos.ovni.partes.MotorDeNave;
import abstractfactory.ejemplos.ovni.partes.ArmaDeNave;

/**
 * @author fobregon
 * 
 * Nave: Representa de forma abstracta el objeto que queremos crear, mediante esta interface se definen la estructura que tendrá el objeto creado.
 */
public abstract class Nave {

    private String nombre;
    private ArmaDeNave armaDeNave;
    private MotorDeNave motorDeNave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MotorDeNave getMotorDeNave() {
        return motorDeNave;
    }

    public void setMotorDeNave(MotorDeNave motorDeNave) {
        this.motorDeNave = motorDeNave;
    }

    public ArmaDeNave getArmaDeNave() {
        return armaDeNave;
    }

    public void setArmaDeNave(ArmaDeNave armaDeNave) {
        this.armaDeNave = armaDeNave;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + getNombre() +
                " | MOTOR: "+ motorDeNave.getInformacionMotorDeNave() +
                " | ARMA: " + armaDeNave.getInformacionArmaDeNave();
    }

    public abstract void hacerNave();
}
