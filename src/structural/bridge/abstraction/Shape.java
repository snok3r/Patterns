package structural.bridge.abstraction;

import structural.bridge.impl.Drawer;

public abstract class Shape {

    private Drawer drawer;

    protected Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    protected Drawer getDrawer() {
        return drawer;
    }

    public abstract void draw();
}
