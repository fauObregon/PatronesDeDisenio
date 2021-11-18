package builder.patron;

/**
 * @author fobregon
 * 
 * Director: Se encarga de construir un objeto utilizando el Constructor (Builder).
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void makeProduct(){
        builder.buildPartOne();
        builder.buildPartTwo();
        builder.buildPartThree();
    }

    public Product getProduct(){
        return builder.getProduct();
    }
}
