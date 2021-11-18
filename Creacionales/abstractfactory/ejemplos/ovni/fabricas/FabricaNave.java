package abstractfactory.ejemplos.ovni.fabricas;

import abstractfactory.ejemplos.ovni.partes.MotorDeNave;
import abstractfactory.ejemplos.ovni.partes.ArmaDeNave;

/**
 * @author fobregon
 * 
 * FabricaAbstracta: Este componente puede ser opcional, sin embargo, se recomienda la creación de un AbstractFactory que define el comportamiento por defecto de las FabricaConcreta.
 */
public abstract class FabricaNave {

    public abstract ArmaDeNave hacerArmaDeNave();
    public abstract MotorDeNave hacerMotorDeNave();

}
