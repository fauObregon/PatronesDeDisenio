package prototype.ejemplos.animales;

/**
 * @author fobregon
 * 
 * FabricaPrototipo: Componente que utilizaremos para mantener el cache de los prototipos existentes, así como para crear clonaciones de los mismos.
 */
public class PrototipoFabricaAnimal {

    public IPrototipoAnimal obtenerClone(IPrototipoAnimal muestraDeAnimal) {
        return muestraDeAnimal.clon();
    }

}
