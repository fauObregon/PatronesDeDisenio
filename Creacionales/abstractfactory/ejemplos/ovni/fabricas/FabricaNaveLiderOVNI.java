package abstractfactory.ejemplos.ovni.fabricas;

import abstractfactory.ejemplos.ovni.partes.MotorDeNave;
import abstractfactory.ejemplos.ovni.partes.ArmaDeNave;
import abstractfactory.ejemplos.ovni.partes.MotorDeLiderOVNI;
import abstractfactory.ejemplos.ovni.partes.ArmaDeLiderOVNI;

/**
 * @author fobregon
 * 
 * FabricaNaveLiderOVNI: Representa una f�brica concreta la cual es utilizada para la creaci�n de los ConcreteProduct, esta clase hereda el comportamiento b�sico del FAbricaNave.
 */
public class FabricaNaveLiderOVNI extends FabricaNave {
    @Override
    public ArmaDeNave hacerArmaDeNave() {
        return new ArmaDeLiderOVNI();
    }

    @Override
    public MotorDeNave hacerMotorDeNave() {
        return new MotorDeLiderOVNI();
    }
}
