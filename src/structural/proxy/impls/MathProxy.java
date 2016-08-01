package structural.proxy.impls;

import structural.proxy.interfaces.IMath;

import java.security.AccessControlException;

/**
 * Proxy with lazy-init and security checking
 */
class MathProxy implements IMath {

    private IMath math;
    private final Integer code;
    private final Integer secretCode = "secretik".hashCode();
    private static final String errMessage = "Wrong code";

    MathProxy(String accessCode) {
        code = accessCode.hashCode();
    }

    private void lazyInit() {
        if (math == null)
            math = new Math();
    }

    private boolean isAccessDenied() {
        return !secretCode.equals(code);
    }

    @Override
    public double add(double x, double y) {
        if (isAccessDenied())
            throw new AccessControlException(errMessage);

        lazyInit();

        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        if (isAccessDenied())
            throw new AccessControlException(errMessage);

        lazyInit();

        return math.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        if (isAccessDenied())
            throw new AccessControlException(errMessage);

        lazyInit();

        return math.mul(x, y);
    }

    @Override
    public double div(double x, double y) {
        if (isAccessDenied())
            throw new AccessControlException(errMessage);

        lazyInit();

        return math.div(x, y);
    }
}
