package structural.flyweight;

import structural.flyweight.impls.CoffeeShop;

public class FlyweightPattern {

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 1);
        shop.takeOrder("Espresso", 1);
        shop.service();

        System.out.println();

        shop.takeOrder("Frappe", 8);
        shop.takeOrder("Cappuccino", 9);
        shop.takeOrder("Frappe", 3);
        shop.takeOrder("Espresso", 3);
        shop.service();

        System.out.println();

        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 6);
        shop.takeOrder("Frappe", 5);
        shop.service();

        System.out.println();

        shop.takeOrder("Cappuccino", 12);
        shop.takeOrder("Espresso", 12);
        shop.takeOrder("Latte", 4);
        shop.service();

        System.out.println("\n" + shop.report());
    }
}
