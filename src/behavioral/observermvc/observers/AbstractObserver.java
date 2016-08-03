package behavioral.observermvc.observers;

import behavioral.observermvc.interfaces.Controller;
import behavioral.observermvc.interfaces.Observer;

public abstract class AbstractObserver implements Observer {

    protected Controller controller;

    protected AbstractObserver(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void destroy() {
        controller.detach(this);
    }

    public abstract void update();
}
