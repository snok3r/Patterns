package creational.prototype.simpleimpl;

import creational.prototype.interfaces.Window;

class SimpleWindow implements Window {

    public SimpleWindow() {
        System.out.println("SimpleWindow");
    }

    public SimpleWindow(SimpleWindow window) {
        System.out.println("SimpleWindow clone");
    }

    @Override
    public void open() {
        System.out.println("SimpleWindow.open");
    }

    @Override
    public void close() {
        System.out.println("SimpleWindow.close");
    }

    @Override
    public Window _clone() {
        return new SimpleWindow(this);
    }
}
