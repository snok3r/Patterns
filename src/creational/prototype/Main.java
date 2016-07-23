package creational.prototype;

import creational.prototype.interfaces.WidgetFactory;
import creational.prototype.simpleimpl.SimpleFactory;

public class Main {

    public static void main(String[] args) {
        WidgetFactory prototype = new WidgetPrototypeFactory(
                SimpleFactory.createWindow(),
                SimpleFactory.createButton(),
                SimpleFactory.createTextField());

        prototype.createWindow();
        prototype.createButton();
        prototype.createTextField();
    }
}
