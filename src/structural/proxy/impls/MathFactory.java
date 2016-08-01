package structural.proxy.impls;

import structural.proxy.interfaces.IMath;

public class MathFactory {
    private MathFactory() {
    }

    public static IMath getMath(String codeWord) {
        return new MathProxy(codeWord);
    }
}
