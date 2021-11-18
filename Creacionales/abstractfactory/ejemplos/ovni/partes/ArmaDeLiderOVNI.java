package abstractfactory.ejemplos.ovni.partes;

/**
 * @author fobregon
 */
public class ArmaDeLiderOVNI implements ArmaDeNave {
    @Override
    public String getInformacionArmaDeNave() {
        return "50 de daño";
    }
}
