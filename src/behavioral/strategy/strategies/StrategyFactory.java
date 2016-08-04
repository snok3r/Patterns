package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.Strategy;

public class StrategyFactory {

    private static final Strategy happyHours = new HappyHours();
    private static final Strategy standard = new Standard();

    public static Strategy getHappyHours() {
        return happyHours;
    }

    public static Strategy getStandard() {
        return standard;
    }
}
