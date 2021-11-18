package abstractfactory.ejemplos.ovni.productos;

import abstractfactory.ejemplos.ovni.fabricas.FabricaNave;
import abstractfactory.ejemplos.ovni.fabricas.FabricaNaveLiderOVNI;

/**
 * @author fobregon
 * 
 * NaveLiderOVNI: Representa una implementación concreta de la interface Nave, la cual es creada a través del FabricaNave.
 */
public class NaveLiderOVNI extends Nave {

    private FabricaNave fabricaNave;

    public NaveLiderOVNI(){
        setNombre("Nave Lider OVNI");
        this.fabricaNave = new FabricaNaveLiderOVNI();
    }

    @Override
    public void hacerNave(){
        System.out.println("Haciendo nueva " + getNombre());
        setMotorDeNave(fabricaNave.hacerMotorDeNave());
        setArmaDeNave(fabricaNave.hacerArmaDeNave());
    }

}
