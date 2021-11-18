package prototype.ejemplos.animales;

/**
 * @author fobregon
 * 
 * PrototipoConcreto (Perro): Implementaciones concretas de InterfazPrototipo los cuales podrán ser clonados.
 */
public class Perro implements IPrototipoAnimal {
    @Override
    public IPrototipoAnimal clon() {
        Perro perroClon = null;

        try {
            perroClon = (Perro) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return perroClon;
    }

    @Override
    public String toString(){
        return "Esto es un Perro";
    }

}
