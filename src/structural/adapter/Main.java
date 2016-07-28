package structural.adapter;

/**
 * Client
 */
public class Main {

    public static void main(String[] args) {

        Shape textShape = new TextShape(new TextView(10, 20));
        textShape.setText("Konnichiwa");

        System.out.println("Upper Right x: " + textShape.getUpperRightX());
        System.out.println("Upper Right y: " + textShape.getUpperRightY());

        textShape.draw();
    }
}
