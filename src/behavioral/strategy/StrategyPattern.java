package behavioral.strategy;

import behavioral.strategy.contexts.Customer;
import behavioral.strategy.strategies.StrategyFactory;

public class StrategyPattern {

    private static void addDrinks(Customer c) {
        c.add(3, 1);
        c.add(5.60, 2);
        c.add(5.40, 2);
        c.add(12.5, 4);
    }

    public static void main(String[] args) {

        System.out.println("Customer 1:");
        Customer customer = new Customer();
        addDrinks(customer);
        customer.printBill();

        System.out.println("---");

        System.out.println("Customer 2:");
        Customer anotherCustomer = new Customer();
        anotherCustomer.setStrategy(StrategyFactory.getHappyHours());
        addDrinks(anotherCustomer);
        anotherCustomer.printBill();
    }
}
