package structural.decorator.decorators;

import structural.decorator.interfaces.VisualComponent;

public class BorderDecorator extends Decorator {

    private final int width;

    public BorderDecorator(VisualComponent visualComponent, int borderWidth) {
        super(visualComponent);
        this.width = borderWidth;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    public void drawBorder() {
        System.out.println("BorderDecorator.drawBorder " + width + "px");
    }
}
