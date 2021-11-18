package builder.patron;

/**
 * @author fobregon
 * 
 * Producto: Objeto que se ha construido tras el proceso definido por el patr�n.
 */
public class Product {

    private String partOne;
    private String partTwo;
    private String partThree;

    public String getPartOne() {
        return partOne;
    }

    public void setPartOne(String partOne) {
        this.partOne = partOne;
    }

    public String getPartTwo() {
        return partTwo;
    }

    public void setPartTwo(String partTwo) {
        this.partTwo = partTwo;
    }

    public String getPartThree() {
        return partThree;
    }

    public void setPartThree(String partThree) {
        this.partThree = partThree;
    }
}
