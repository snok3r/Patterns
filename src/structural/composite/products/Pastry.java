package structural.composite.products;

import structural.composite.interfaces.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/**
 * Composite 2
 */
public class Pastry extends Product {

    private Set<Product> ingredients;

    public Pastry(int kcal, int weight) {
        super("Pastry", kcal, weight);
    }

    @Override
    public void addProduct(Product product) {
        if (ingredients == null)
            ingredients = new HashSet<>();

        ingredients.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        ingredients.remove(product);
    }

    @Override
    public void eat() {
        System.out.println("Pastry.eat");
        ingredients.forEach(Product::eat);
    }

    @Override
    public int getKcal() {
        return total(
                ingredients.parallelStream(),
                Product::getKcal
        ) + super.getKcal();
    }

    @Override
    public int getWeight() {
        return total(
                ingredients.parallelStream(),
                Product::getWeight
        ) + super.getWeight();
    }

    private int total(Stream<Product> stream, ToIntFunction<? super Product> mapper) {
        return stream.mapToInt(mapper).sum();
    }

    @Override
    public Iterator<Product> getIterator() {
        return ingredients.iterator();
    }
}
