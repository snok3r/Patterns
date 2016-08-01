package structural.composite.interfaces;

import java.util.Collections;
import java.util.Iterator;

/**
 * Component
 */
public abstract class Product {

    private final String name;
    private final int kcal;
    private final int weight;

    protected Product(String name, int kcal, int weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
    }

    public void addProduct(Product product) {
    }

    public void removeProduct(Product product) {
    }

    public String getName() {
        return name;
    }

    public int getKcal() {
        return kcal;
    }

    public int getWeight() {
        return weight;
    }

    public Iterator<Product> getIterator() {
        return Collections.emptyIterator();
    }

    public abstract void eat();
}
