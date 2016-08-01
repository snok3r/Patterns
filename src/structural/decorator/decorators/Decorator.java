package structural.decorator.decorators;

import structural.decorator.interfaces.VisualComponent;

public class Decorator implements VisualComponent {

    protected final VisualComponent visualComponent;

    protected Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    @Override
    public void draw() {
        visualComponent.draw();
    }
}
