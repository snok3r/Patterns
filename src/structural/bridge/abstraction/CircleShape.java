package structural.bridge.abstraction;

import structural.bridge.impl.Drawer;

public class CircleShape extends Shape {

    private int x;
    private int y;
    private int radius;

    public CircleShape(int x, int y, int radius, Drawer drawer) {
        super(drawer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        getDrawer().drawCircle(x, y, radius);
    }
}
