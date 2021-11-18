package abstractfactory.ejemplos.ovni.productos;

import abstractfactory.ejemplos.ovni.fabricas.FabricaNave;
import abstractfactory.ejemplos.ovni.fabricas.FabricaNaveOVNI;

/**
 * @author fobregon
 * 
 * NaveOVNI: Representa una implementación concreta de la interface Nave, la cual es creada a través del FabricaNave.
 */
public class NaveOVNI extends Nave {

    private FabricaNave fabricaNave;

    public NaveOVNI(){
        setNombre("Nave OVNI");
        this.fabricaNave = new FabricaNaveOVNI();
    }

    @Override
    public void hacerNave(){
        System.out.println("Haciendo nueva " + getNombre());
        setMotorDeNave(fabricaNave.hacerMotorDeNave());
        setArmaDeNave(fabricaNave.hacerArmaDeNave());
    }

}
