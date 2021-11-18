package builder.patron;

/**
 * @author fobregon
 * 
 * Constructor: Interfaz abstracta que permite la creación de objetos.
 */
public interface Builder {
    public void buildPartOne();
    public void buildPartTwo();
    public void buildPartThree();
    public Product getProduct();
}
