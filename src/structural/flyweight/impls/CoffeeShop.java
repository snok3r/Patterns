package structural.flyweight.impls;

import structural.flyweight.interfaces.Coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * Client
 */
public class CoffeeShop {

    private final List<Order> orders = new ArrayList<>();
    private final Menu menu = new Menu();

    public void takeOrder(String flavourName, int table) {
        Coffee flavour = menu.getCoffeeFlavour(flavourName);
        orders.add(new Order(table, flavour));
    }

    public void service() {
        synchronized (orders) {
            orders.forEach(Order::serve);
            orders.clear();
        }
    }

    public String report() {
        return "Total CoffeeFlavour objects made: "
                + menu.totalCoffeeFlavoursMade();
    }
}
