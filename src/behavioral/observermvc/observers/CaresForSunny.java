package behavioral.observermvc.observers;

import behavioral.observermvc.interfaces.Controller;

public class CaresForSunny extends AbstractObserver {

    public CaresForSunny(Controller controller) {
        super(controller);
    }

    @Override
    public void update() {
        if ("sunny".equals(controller.getInfo()))
            System.out.println("CaresForSunny: Alright, it's sunny now!");
    }
}
