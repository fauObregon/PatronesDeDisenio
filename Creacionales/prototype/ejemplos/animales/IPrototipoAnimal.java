package prototype.ejemplos.animales;

/**
 * @author fobregon
 * 
 * InterfazPrototipo: Este componente por lo general es una interface y define los atributos mínimos de un prototipo, 
 * esta interface debe contar por lo menos con alguno de los dos tipos de clonación. 
 * Clonación superficial (clone) o clonación en profundidad (deepClone) los cuales explicaremos más adelante.
 */
public interface IPrototipoAnimal extends Cloneable{
    public IPrototipoAnimal clon();
}
