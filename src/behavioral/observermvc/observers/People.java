package behavioral.observermvc.observers;

import behavioral.observermvc.interfaces.Controller;

public class People extends AbstractObserver {

    public People(Controller controller) {
        super(controller);
    }

    @Override
    public void update() {
        System.out.println("People: wow it's " + controller.getInfo());
    }
}
