package decorator.ejemplos.pizzas;

/**
 * 
 * @author fobregon
 * 
 * Componente: (Pizza) Clase abstracta o interfaz que deben poseer los objetos que necesiten ser 'decorados'.
 *
 */
public interface IPizza {
	
    public String getDescripcion();
    public double getPrecio();
}
