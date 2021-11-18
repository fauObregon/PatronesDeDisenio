package abstractfactory.ejemplos.ovni;

import abstractfactory.ejemplos.ovni.productos.Nave;
import abstractfactory.ejemplos.ovni.productos.NaveLiderOVNI;
import abstractfactory.ejemplos.ovni.productos.NaveOVNI;


/**
 * @author fobregon
 */
public class TestNavesAbstractFactory {

    public static void main(String[] args) {

        Nave nave;
        String tipoDeNave;

        tipoDeNave = "OVNI";
        if(tipoDeNave.equalsIgnoreCase("OVNI")){
            nave = new NaveOVNI();
            nave.hacerNave();
            System.out.println(nave.toString());
        }

        tipoDeNave = "Lider OVNI";
        if(tipoDeNave.equalsIgnoreCase("Lider OVNI")){
            nave = new NaveLiderOVNI();
            nave.hacerNave();
            System.out.println(nave.toString());
        }

    }

}
