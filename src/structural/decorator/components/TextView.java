package structural.decorator.components;

import structural.decorator.interfaces.VisualComponent;

public class TextView implements VisualComponent {
    @Override
    public void draw() {
        System.out.println("TextView.draw");
    }
}
