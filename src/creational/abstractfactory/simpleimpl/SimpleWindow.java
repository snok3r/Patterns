package creational.abstractfactory.simpleimpl;

import creational.abstractfactory.interfaces.Window;

public class SimpleWindow implements Window {
    @Override
    public void open() {
        System.out.println("SimpleWindow.open");
    }

    @Override
    public void close() {
        System.out.println("SimpleWindow.close");
    }
}
