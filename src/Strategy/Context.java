package Strategy;

public class Context {
    private IStrategy strategy= new StrategyIMPL2(); // StrategyIMPL2() default strategy
    public void doStrategy(){
        strategy.strategy();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
