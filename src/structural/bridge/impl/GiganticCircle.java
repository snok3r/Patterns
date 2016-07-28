package structural.bridge.impl;

public class GiganticCircle implements Drawer {

    private static final int radiusMultiplier = 5;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("GiganticCircle.drawCircle");
        System.out.println("x = [" + x + "], y = [" + y + "], radius = [" + radius * radiusMultiplier + "]");
    }
}
