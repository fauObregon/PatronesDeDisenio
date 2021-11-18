package strategy.ejemplos.transportacion;

/**
 * @author fobregon
 */
public class TestModoDeTransporte {

    public static void main(String[] args) {

        Viajero johnViajero = new Viajero("John");
        Viajero lucyViajero = new Viajero("Lucy");
        Viajero rickViajero = new Viajero("Rick");

        johnViajero.setModoDeTransporte(new BusPublico());
        lucyViajero.setModoDeTransporte(new VehiculoPersonal());
        rickViajero.setModoDeTransporte(new Taxi());

        johnViajero.viajarAlAeropuerto();
        lucyViajero.viajarAlAeropuerto();
        rickViajero.viajarAlAeropuerto();

    }

}
