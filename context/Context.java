package context;

import strategy.ConcreteStrategyA;
import strategy.Strategy;

public class Context {

    private Strategy strategy;

    public Context() {
	strategy = new ConcreteStrategyA();
    }

    public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
    }

    public void action() {
	strategy.algorithInterface();
    }
}
