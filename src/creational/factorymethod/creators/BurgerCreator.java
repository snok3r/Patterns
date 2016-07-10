package creational.factorymethod.creators;

import creational.factorymethod.products.Burger;
import creational.factorymethod.products.Product;

public class BurgerCreator extends ProductCreator {
    @Override
    public Product createProduct() {
        return new Burger();
    }
}
