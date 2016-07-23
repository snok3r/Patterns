package creational.prototype;

import creational.prototype.interfaces.Button;
import creational.prototype.interfaces.TextField;
import creational.prototype.interfaces.WidgetFactory;
import creational.prototype.interfaces.Window;

public class WidgetPrototypeFactory implements WidgetFactory {

    private Window prototypeWindow;
    private Button prototypeButton;
    private TextField prototypeTextField;

    public WidgetPrototypeFactory(Window pWindow, Button pButton, TextField pTextField) {
        prototypeWindow = pWindow;
        prototypeButton = pButton;
        prototypeTextField = pTextField;
    }

    @Override
    public Window createWindow() {
        return prototypeWindow._clone();
    }

    @Override
    public Button createButton() {
        return prototypeButton._clone();
    }

    @Override
    public TextField createTextField() {
        return prototypeTextField._clone();
    }
}
