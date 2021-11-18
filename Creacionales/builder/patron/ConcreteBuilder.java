package builder.patron;

/**
 * @author fobregon
 * 
 * ConstructorConcreto: Implementación concreta del Builder definida para cada uno de los tipos. 
 * Permite crear el objeto concreto recopilando y creando cada una de las partes que lo compone.
 */
public class ConcreteBuilder implements Builder{

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartOne() {
        product.setPartOne("Part One");
    }

    @Override
    public void buildPartTwo() {
        product.setPartTwo("Part Two");
    }

    @Override
    public void buildPartThree() {
        product.setPartThree("Part Three");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
