package abstractfactory.ejemplos.ovni.partes;

/**
 * @author fobregon
 */
public class MotorOVNI implements MotorDeNave {
    @Override
    public String getInformacionMotorDeNave() {
        return "1000 rpm";
    }
}
