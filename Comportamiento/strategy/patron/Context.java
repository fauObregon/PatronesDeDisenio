package strategy.patron;

/**
 * @author fobregon
 * 
 * Contexto: 
 * Componente que encapsula la estrategia a utilizar, 
 * tiene como caracter�stica que se puede establecer la estrategia a utilizar en tiempo de ejecuci�n.
 */
public class Context {

    private Strategy strategy;

    public Context(){}

    public void setStrategy(Strategy behavior) {
        this.strategy = behavior;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void executeStrategy(){
        System.out.println(strategy.doSomething());
    }
}
