package behavioral.template.interfaces;

public abstract class AbstractEquation {

    /**
     * Template method
     */
    public void solve() {
        doLoad();
        doProcessParameters();
        doSolve();
    }

    protected abstract void doLoad();

    protected abstract void doProcessParameters();

    protected abstract void doSolve();
}
