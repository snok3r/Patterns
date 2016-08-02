package behavioral.chainofresponsibility.impls;

import behavioral.chainofresponsibility.interfaces.PurchasePower;

public class PresidentPurchasePower extends PurchasePower {

    @Override
    protected int getAllowable() {
        return BASE * 100;
    }

    @Override
    protected String getRole() {
        return "President";
    }
}
