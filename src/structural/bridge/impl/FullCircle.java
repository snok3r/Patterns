package structural.bridge.impl;

public class FullCircle implements Drawer {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("FullCircle.drawCircle");
        System.out.println("x = [" + x + "], y = [" + y + "], radius = [" + radius + "]");
    }
}
