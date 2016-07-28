package structural.adapter;

/**
 * Adaptee
 */
public class TextView {

    private int width;
    private int height;

    private String text;

    public TextView() {
        this(0, 0);
    }

    public TextView(int width, int height) {
        this(width, height, "");
    }

    public TextView(int width, int height, String text) {
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
