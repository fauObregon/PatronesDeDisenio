package prototype.patron;

/**
 * @author fobregon
 * 
 * InterfazPrototipo: Este componente por lo general es una interface y define los atributos mínimos de un prototipo, 
 * esta interface debe contar por lo menos con alguno de los dos tipos de clonación. 
 * Clonación superficial (clone) o clonación en profundidad (deepClone).
 */
public interface IPrototype extends Cloneable {
    public IPrototype clon();
}
