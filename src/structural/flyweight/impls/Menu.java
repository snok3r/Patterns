package structural.flyweight.impls;

import structural.flyweight.interfaces.Coffee;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * CoffeeFlavour (Flyweight class) factory
 */
class Menu {
    private final Map<String, Coffee> flavours = new ConcurrentHashMap<>();
    private final CoffeeFactory factory = CoffeeFactory.getFactory();

    Coffee getCoffeeFlavour(String flavourName) {
        if (!flavours.containsKey(flavourName))
            flavours.put(flavourName, factory.getCoffee(flavourName));

        return flavours.get(flavourName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}
