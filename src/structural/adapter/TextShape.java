package structural.adapter;

/**
 * Adapter
 */
public class TextShape implements Shape {

    private TextView textView;

    public TextShape(TextView textView) {
        this.textView = textView;
    }

    @Override
    public int getLowerLeftX() {
        return 0;
    }

    @Override
    public int getLowerLeftY() {
        return 0;
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
    public void setText(String t) {
        textView.setText(t);
    }

    @Override
    public void draw() {
        System.out.println("TextShape.draw, text is \"" + textView.getText() + "\"");
    }
}
