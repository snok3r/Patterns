package creational.abstractfactory.metalimpl;

import creational.abstractfactory.interfaces.Window;

class MetalWindow implements Window {
    @Override
    public void open() {
        System.out.println("MetalWindow.open");
    }

    @Override
    public void close() {
        System.out.println("MetalWindow.close");
    }
}
