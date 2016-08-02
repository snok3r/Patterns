package behavioral.chainofresponsibility.impls;

import behavioral.chainofresponsibility.interfaces.PurchasePower;

public class ManagerPurchasePower extends PurchasePower {

    @Override
    protected int getAllowable() {
        return BASE * 10;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }
}
