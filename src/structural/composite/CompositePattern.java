package structural.composite;

import structural.composite.interfaces.Product;
import structural.composite.products.Cheese;
import structural.composite.products.Pastry;
import structural.composite.products.Pizza;
import structural.composite.products.Tomato;

public class CompositePattern {

    public static void main(String[] args) {

        Product pastry = new Pastry(800, 400);
        pastry.addProduct(new Cheese(100, 150));
        pastry.addProduct(new Tomato(40, 60));

        Product pizza = new Pizza("Margarita with Tomatoes");
        pizza.addProduct(pastry);

        System.out.println(
                pizza.getName()
                        + ": weight " + pizza.getWeight()
                        + ", kcal " + pizza.getKcal()
        );
        pizza.eat();

        Product cheese = new Cheese(100, 150);
        System.out.println();
        System.out.println(
                cheese.getName()
                        + ": weight " + cheese.getWeight()
                        + ", kcal " + cheese.getKcal()
        );
        cheese.eat();
    }
}
