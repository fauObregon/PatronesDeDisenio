package prototype.ejemplos.animales;

/**
 * @author fobregon
 */
public class TestPrototipoAnimal {

    public static void main(String[] args) {

        PrototipoFabricaAnimal fabrica = new PrototipoFabricaAnimal();
        IPrototipoAnimal iPrototipoAnimal;
        IPrototipoAnimal animalCLonado;

        System.out.println("El turno de los Perros...");

        iPrototipoAnimal = new Perro();
        animalCLonado = (Perro) fabrica.obtenerClone(iPrototipoAnimal);
        System.out.println(iPrototipoAnimal + " con ID: " + System.identityHashCode(System.identityHashCode(iPrototipoAnimal)));
        System.out.println(animalCLonado + " con ID: " + System.identityHashCode(System.identityHashCode(animalCLonado)));

        System.out.println("El turno de los Gatos...");

        iPrototipoAnimal = new Gato();
        animalCLonado = (Gato) fabrica.obtenerClone(iPrototipoAnimal);
        System.out.println(iPrototipoAnimal + " con ID: " + System.identityHashCode(System.identityHashCode(iPrototipoAnimal)));
        System.out.println(animalCLonado + " con ID: " + System.identityHashCode(System.identityHashCode(animalCLonado)));


    }

}
