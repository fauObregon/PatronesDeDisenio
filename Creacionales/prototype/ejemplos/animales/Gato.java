package prototype.ejemplos.animales;

/**
 * @author fobregon
 * 
 * PrototipoConcreto (Gato): Implementaciones concretas de InterfazPrototipo los cuales podrán ser clonados.
 */
public class Gato implements IPrototipoAnimal {
    @Override
    public IPrototipoAnimal clon() {
        Gato gatoClon = null;

        try {
            gatoClon = (Gato) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return gatoClon;
    }

    @Override
    public String toString(){
        return "Esto es un Gato";
    }
}
