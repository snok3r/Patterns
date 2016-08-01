package structural.composite.products;

import structural.composite.interfaces.Product;

/**
 * Leaf
 */
public class Tomato extends Product {

    public Tomato(int kcal, int weight) {
        super("Tomato", kcal, weight);
    }

    @Override
    public void eat() {
        System.out.println("Tomato.eat");
    }
}
