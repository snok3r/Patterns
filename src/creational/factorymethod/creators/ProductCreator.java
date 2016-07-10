package creational.factorymethod.creators;

import creational.factorymethod.products.Product;

public abstract class ProductCreator {
    // factory method
    public abstract Product createProduct();
}
