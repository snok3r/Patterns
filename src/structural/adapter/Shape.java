package structural.adapter;

public interface Shape {

    int getUpperRightX();

    int getUpperRightY();

    void setUpperRightX(int x);

    void setUpperRightY(int y);

    void draw();

    void setText(String t);
}
