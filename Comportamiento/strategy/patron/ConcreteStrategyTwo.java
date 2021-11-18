package strategy.patron;

/**
 * @author fobregon
 * 
 * EstrategiaConcreta: Representa las estrategias concretas, las cuales heredan de InterfaceEstrategia.
 */
public class ConcreteStrategyTwo implements Strategy {
    @Override
    public String doSomething() {
        return "Concrete Strategy Two";
    }
}
