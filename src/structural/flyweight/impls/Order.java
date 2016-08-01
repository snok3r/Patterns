package structural.flyweight.impls;

import structural.flyweight.interfaces.Coffee;

class Order {
    private final int tableNumber;
    private final Coffee coffee;

    Order(int tableNumber, Coffee coffee) {
        this.tableNumber = tableNumber;
        this.coffee = coffee;
    }

    void serve() {
        System.out.println("Serving " + coffee + " to table " + tableNumber);
    }
}
