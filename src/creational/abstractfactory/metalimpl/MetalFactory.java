package creational.abstractfactory.metalimpl;

import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.WidgetFactory;
import creational.abstractfactory.interfaces.Window;

public class MetalFactory implements WidgetFactory {
    private static MetalFactory ourInstance = new MetalFactory();

    public static MetalFactory getInstance() {
        return ourInstance;
    }

    private MetalFactory() {
        System.out.println("MetalFactory");
    }

    @Override
    public Window createWindow() {
        return new MetalWindow();
    }

    @Override
    public Button createButton() {
        return new MetalButton();
    }
}
