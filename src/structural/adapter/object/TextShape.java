package structural.adapter.object;

import structural.adapter.Shape;
import structural.adapter.TextView;

/**
 * Adapter
 */
public class TextShape implements Shape {

    private TextView textView;

    public TextShape(TextView textView) {
        this.textView = textView;
    }

    @Override
    public int getUpperRightX() {
        return textView.getWidth();
    }

    @Override
    public int getUpperRightY() {
        return textView.getHeight();
    }

    @Override
    public void setUpperRightX(int x) {
        textView.setWidth(x);
    }

    @Override
    public void setUpperRightY(int y) {
        textView.setHeight(y);
    }

    @Override
    public void setText(String t) {
        textView.setText(t);
    }

    @Override
    public void draw() {
        System.out.println("TextShape.draw, text is \"" + textView.getText() + "\"");
    }
}
