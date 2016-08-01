package structural.flyweight.impls;

import structural.flyweight.interfaces.Coffee;

class CoffeeFactory {
    private static final CoffeeFactory factory = new CoffeeFactory();

    static CoffeeFactory getFactory() {
        return factory;
    }

    private CoffeeFactory() {
    }

    Coffee getCoffee(String coffeeFlavour) {
        return new CoffeeFlavour(coffeeFlavour);
    }
}
