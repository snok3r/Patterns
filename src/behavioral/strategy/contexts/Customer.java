package behavioral.strategy.contexts;

import behavioral.strategy.interfaces.Context;
import behavioral.strategy.interfaces.Strategy;
import behavioral.strategy.strategies.StrategyFactory;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Context {

    private Strategy strategy;
    private final List<Double> drinks;

    public Customer() {
        this(StrategyFactory.getStandard());
    }

    public Customer(Strategy strategy) {
        this.strategy = strategy;
        drinks = new ArrayList<>();
    }

    public void add(double price, int quantity) {
        drinks.add(strategy.getActualPrice(price * quantity));
    }

    public void printBill() {
        drinks.forEach(System.out::println);
        System.out.println(
                "Total due: " + drinks.parallelStream()
                        .mapToDouble(Double::doubleValue)
                        .sum()
        );
        drinks.clear();
    }

    @Override
    public void setStrategy(Strategy s) {
        strategy = s;
    }
}
