package structural.decorator.decorators;

import structural.decorator.interfaces.VisualComponent;

public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {
        super.draw();
        drawScrollBar();
    }

    public void drawScrollBar() {
        System.out.println("ScrollBarDecorator.drawScrollBar");
    }
}
