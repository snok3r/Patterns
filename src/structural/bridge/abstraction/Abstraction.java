package structural.bridge.abstraction;

import structural.bridge.impl.Implementor;

public class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    protected Implementor getImplementor() {
        return implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }
}
