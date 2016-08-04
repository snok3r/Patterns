package behavioral.template.impls;

import behavioral.template.interfaces.AbstractEquation;

public class SimpleEquation extends AbstractEquation {

    @Override
    protected void doLoad() {
        System.out.println("a * x + 1 = 0");
    }

    @Override
    protected void doProcessParameters() {
        System.out.println("a = 1");
    }

    @Override
    protected void doSolve() {
        System.out.println("x = -1");
    }
}
