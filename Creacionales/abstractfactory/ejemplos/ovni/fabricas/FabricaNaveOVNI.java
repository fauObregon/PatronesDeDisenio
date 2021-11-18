package abstractfactory.ejemplos.ovni.fabricas;

import abstractfactory.ejemplos.ovni.partes.MotorDeNave;
import abstractfactory.ejemplos.ovni.partes.ArmaDeNave;
import abstractfactory.ejemplos.ovni.partes.MotorOVNI;
import abstractfactory.ejemplos.ovni.partes.ArmaOVNI;

/**
 * @author fobregon
 * 
 * FabricaNaveOVNI: Representa una fábrica concreta la cual es utilizada para la creación de los ConcreteProduct, esta clase hereda el comportamiento básico del FAbricaNave.
 */
public class FabricaNaveOVNI extends FabricaNave {
    @Override
    public ArmaDeNave hacerArmaDeNave() {
        return new ArmaOVNI();
    }

    @Override
    public MotorDeNave hacerMotorDeNave() {
        return new MotorOVNI();
    }
}
