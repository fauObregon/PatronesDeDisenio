package strategy.ejemplos.transportacion;

/**
 * @author fobregon
 * 
 * EstrategiaConcreta: Representa las estrategias concretas, las cuales heredan de InterfaceEstrategia.
 */
public class BusPublico implements  ModoDeTransporte {

    @Override
    public String viajar() {
        return "Viajando al aeropuerto en: Bus publico";
    }

}
