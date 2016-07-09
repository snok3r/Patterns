package creational.abstractfactory.interfaces;

public interface WidgetFactory {
    Window createWindow();

    Button createButton();

    TextField createTextField();
}
