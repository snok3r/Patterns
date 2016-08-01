package structural.proxy;

import structural.proxy.impls.MathFactory;
import structural.proxy.interfaces.IMath;

public class ProxyPattern {

    public static void main(String[] args) {
        IMath math = MathFactory.getMath("secretik");

        System.out.println("4 + 2 = " + math.add(4, 2));
        System.out.println("4 - 2 = " + math.sub(4, 2));
        System.out.println("4 * 2 = " + math.mul(4, 2));
        System.out.println("4 / 2 = " + math.div(4, 2));
    }
}
