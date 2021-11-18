package prototype.ejemplos.animales;

/**
 * @author fobregon
 * 
 * InterfazPrototipo: Este componente por lo general es una interface y define los atributos m�nimos de un prototipo, 
 * esta interface debe contar por lo menos con alguno de los dos tipos de clonaci�n. 
 * Clonaci�n superficial (clone) o clonaci�n en profundidad (deepClone) los cuales explicaremos m�s adelante.
 */
public interface IPrototipoAnimal extends Cloneable{
    public IPrototipoAnimal clon();
}
