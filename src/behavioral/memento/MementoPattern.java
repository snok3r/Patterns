package behavioral.memento;

import behavioral.memento.impls.Car;

/**
 * Caretaker
 */
public class MementoPattern {

    public static void main(String[] args) {
        Car newCar = new Car("Black", 100, 30);

        System.out.println("New car: " + newCar);
        System.out.println("Saving this state..");
        newCar.saveState();

        System.out.println("Run for 50 miles..");
        newCar.run();
        newCar.run();
        newCar.run();
        newCar.run();
        newCar.run();

        System.out.println("Before restoring: " + newCar);
        newCar.restoreState();
        System.out.println("After restore: " + newCar);
    }
}
