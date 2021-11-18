package prototype.patron;

/**
 * @author fobregon
 * 
 * InterfazPrototipo: Este componente por lo general es una interface y define los atributos m�nimos de un prototipo, 
 * esta interface debe contar por lo menos con alguno de los dos tipos de clonaci�n. 
 * Clonaci�n superficial (clone) o clonaci�n en profundidad (deepClone).
 */
public interface IPrototype extends Cloneable {
    public IPrototype clon();
}
