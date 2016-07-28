package structural.bridge;

import structural.bridge.abstraction.CircleShape;
import structural.bridge.abstraction.Shape;
import structural.bridge.impl.FullCircle;
import structural.bridge.impl.GiganticCircle;

import java.util.Arrays;
import java.util.List;

public class BridgePattern {

    public static void main(String[] args) {

        List<Shape> circles = Arrays.asList(
                new CircleShape(0, 0, 10, new FullCircle()),
                new CircleShape(0, 0, 20, new GiganticCircle())
        );

        circles
                .stream()
                .forEach(Shape::draw);
    }
}
