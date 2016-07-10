package creational.factorymethod.products;

public class Burger extends Product {
    @Override
    public void eat() {
        System.out.println("Burger.eat");
    }
}
