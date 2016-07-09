package creational.abstractfactory.simpleimpl;

import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.WidgetFactory;
import creational.abstractfactory.interfaces.Window;

public class SimpleFactory implements WidgetFactory {
    private static SimpleFactory ourInstance = new SimpleFactory();

    public static SimpleFactory getInstance() {
        return ourInstance;
    }

    private SimpleFactory() {
        System.out.println("SimpleFactory");
    }

    @Override
    public Window createWindow() {
        return new SimpleWindow();
    }

    @Override
    public Button createButton() {
        return new SimpleButton();
    }
}
