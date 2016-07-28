package creational.factorymethod.creators;

import creational.factorymethod.products.Pizza;
import creational.factorymethod.products.Product;

public class PizzaCreator extends ProductCreator {
    @Override
    public Product createProduct() {
        return new Pizza();
    }
}
