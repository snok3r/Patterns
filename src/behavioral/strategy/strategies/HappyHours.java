package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.Strategy;

class HappyHours implements Strategy {

    @Override
    public double getActualPrice(double rawPrice) {
        return rawPrice * 0.5;
    }
}
