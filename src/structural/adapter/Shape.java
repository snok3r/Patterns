package structural.adapter;

public interface Shape {

    int getLowerLeftX();

    int getLowerLeftY();

    int getUpperRightX();

    int getUpperRightY();

    void draw();

    void setText(String t);
}
