package structural.adapter;

/**
 * Client
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Object Adapter: ");
        Shape textShape = new structural.adapter.object.TextShape(new TextView(10, 20));
        textShape.setText("Konnichiwa object");

        System.out.println("Upper Right x: " + textShape.getUpperRightX());
        System.out.println("Upper Right y: " + textShape.getUpperRightY());

        textShape.draw();


        System.out.println();


        System.out.println("Class Adapter: ");
        textShape = new structural.adapter.clazz.TextShape();
        textShape.setText("Konnichiwa clazz");
        textShape.setUpperRightX(10);
        textShape.setUpperRightY(20);

        System.out.println("Upper Right x: " + textShape.getUpperRightX());
        System.out.println("Upper Right y: " + textShape.getUpperRightY());

        textShape.draw();
    }

}
