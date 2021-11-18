package composite.ejemplos.menu;

/**
 * @author fobregon
 * 
 * MenuComponente: Generalmente es una interface o clase abstracta que tiene las operaciones minimas que seran utilizadas, 
 * este componente debera ser extendido por los otros dos componentes MenuItem y MenuCompuesto.
 */
public abstract class MenuComponente {

    protected String nombre;
    protected static StringBuffer identado = new StringBuffer();
    
    public void add(MenuComponente componente) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponente componente) {
        throw new UnsupportedOperationException();
    }

    public String getNombre() {
        throw new UnsupportedOperationException();
    }

    public double getPrecio() {
        throw new UnsupportedOperationException();
    }

    public boolean esVegetariano() {
        throw new UnsupportedOperationException();
    }

    public void imprimir() {
        throw new UnsupportedOperationException();
    }
}
