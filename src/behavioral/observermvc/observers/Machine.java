package behavioral.observermvc.observers;

import behavioral.observermvc.interfaces.Controller;

import java.util.Arrays;

public class Machine extends AbstractObserver {

    public Machine(Controller controller) {
        super(controller);
    }

    @Override
    public void update() {
        System.out.println("Machine: " + Arrays.toString(controller.getInfo().getBytes()));
    }
}
