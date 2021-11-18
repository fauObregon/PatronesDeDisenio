package abstractfactory.ejemplos.ovni.partes;

/**
 * @author fobregon
 */
public class MotorDeLiderOVNI implements MotorDeNave {
    @Override
    public String getInformacionMotorDeNave() {
        return "5000 rpm";
    }
}
