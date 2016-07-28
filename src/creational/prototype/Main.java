package creational.prototype;

import creational.prototype.interfaces.Button;
import creational.prototype.interfaces.Window;
import creational.prototype.simpleimpl.SimpleFactory;

public class Main {

    public static void main(String[] args) {
        WidgetPrototypeFactory prototypeFactory = new WidgetPrototypeFactory();

        prototypeFactory.setPrototypeWidget(SimpleFactory.createButton());
        Button button = (Button) prototypeFactory.create();
        button.click();

        System.out.println();

        prototypeFactory.setPrototypeWidget(SimpleFactory.createWindow());
        Window window = (Window) prototypeFactory.create();
        window.open();
        window.close();
    }
}
