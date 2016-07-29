package structural.bridge;

import structural.bridge.abstraction.Abstraction;
import structural.bridge.impl.ImplementorX;
import structural.bridge.impl.ImplementorZ;

import java.util.Arrays;
import java.util.List;

public class BridgePattern {

    public static void main(String[] args) {

        List<Abstraction> impls = Arrays.asList(
                new Abstraction(new ImplementorX()),
                new Abstraction(new ImplementorZ())
        );

        impls
                .stream()
                .forEach(Abstraction::operation);
    }
}
