package structural.decorator;

import structural.decorator.components.TextView;
import structural.decorator.decorators.BorderDecorator;
import structural.decorator.decorators.ScrollBarDecorator;
import structural.decorator.interfaces.VisualComponent;

public class DecoratorPattern {

    public static void main(String[] args) {
        VisualComponent textView = new BorderDecorator(
                new ScrollBarDecorator(new TextView()), 10
        );
        textView.draw();

        System.out.println();

        VisualComponent otherTextView = new BorderDecorator(new TextView(), 15);
        otherTextView.draw();
    }
}
