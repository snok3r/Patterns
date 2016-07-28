package structural.adapter.clazz;

import structural.adapter.Shape;
import structural.adapter.TextView;

public class TextShape extends TextView implements Shape {

    @Override
    public int getUpperRightX() {
        return getWidth();
    }

    @Override
    public int getUpperRightY() {
        return getHeight();
    }

    @Override
    public void setUpperRightX(int x) {
        setWidth(x);
    }

    @Override
    public void setUpperRightY(int y) {
        setHeight(y);
    }

    @Override
    public void draw() {
        System.out.println("TextShape.draw, text is \"" + getText() + "\"");
    }
}
