package behavioral.template.impls;

import behavioral.template.interfaces.AbstractEquation;

public class HardEquation extends AbstractEquation{

    @Override
    protected void doLoad() {
        System.out.println("a * x^2 - 2*x + 1 = 0");
    }

    @Override
    protected void doProcessParameters() {
        System.out.println("a = 1");
    }

    @Override
    protected void doSolve() {
        System.out.println("x = 1");
    }
}
