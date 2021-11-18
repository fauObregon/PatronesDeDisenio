package prototype.patron;

/**
 * @author fobregon
 * 
 * FabricaPrototipo: Componente que utilizaremos para mantener el cache de los prototipos existentes, así como para crear clonaciones de los mismos.
 */
public class PrototypeFactory {

    public IPrototype getClone(IPrototype proto){
        return proto.clon();
    }
}
