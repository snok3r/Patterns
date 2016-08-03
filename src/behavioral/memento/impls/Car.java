package behavioral.memento.impls;

import behavioral.memento.interfaces.Originator;

/**
 * Originator
 */
public class Car implements Originator {

    private final State state;

    private final String colour;
    private int miles;
    private int petrolLeft;

    public Car(String colour, int petrolLeft) {
        this(colour, 0, petrolLeft);
    }

    public Car(String colour, int miles, int petrolLeft) {
        this.colour = colour;
        this.miles = miles;
        this.petrolLeft = petrolLeft;

        state = new State();
    }

    public void run() {
        if (petrolLeft > 0) {
            miles += 10;
            petrolLeft -= 1;
        } else {
            System.out.println("Not enough petrol");
        }
    }

    public void fillUp(int liters) {
        if (liters >= 0)
            petrolLeft += liters;
    }

    @Override
    public void saveState() {
        state.setState(this);
    }

    @Override
    public void restoreState() {
        state.restoreState(this);
    }

    @Override
    public String toString() {
        return "{" +
                "colour='" + colour + '\'' +
                ", petrolLeft=" + petrolLeft +
                ", miles=" + miles +
                '}';
    }

    /**
     * Memento
     */
    private class State {
        long state;

        void setState(Car car) {
            long localState = car.miles;
            localState <<= 32;
            localState |= car.petrolLeft;

            state = localState;
        }

        void restoreState(Car car) {
            long localState = state;
            car.petrolLeft = (int) (localState & 0xFFFFFFFF);
            car.miles = (int) (localState >> 32);
        }
    }
}
