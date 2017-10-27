package main;

import context.Context;
import strategy.ConcreteStrategyB;

public class Test {

    public static void main(String[] args) {

	Context c = new Context();

	c.action();
	c.setStrategy(new ConcreteStrategyB());
	c.action();

    }

}
