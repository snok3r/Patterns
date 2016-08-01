package structural.composite.products;

import structural.composite.interfaces.Product;

/**
 * Leaf
 */
public class Cheese extends Product {

    public Cheese(int kcal, int weight) {
        super("Cheese", kcal, weight);
    }

    @Override
    public void eat() {
        System.out.println("Cheese.eat");
    }
}
