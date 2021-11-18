package strategy.patron;

/**
 * @author fobregon
 * 
 * EstrategiaConcreta: Representa las estrategias concretas, las cuales heredan de InterfaceEstrategia.
 */
public class ConcreteStrategyOne implements Strategy {
    @Override
    public String doSomething() {
        return "ConcreteStrategyOne";
    }
}
