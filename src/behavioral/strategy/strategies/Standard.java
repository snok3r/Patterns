package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.Strategy;

class Standard implements Strategy {

    @Override
    public double getActualPrice(double rawPrice) {
        return rawPrice;
    }
}
