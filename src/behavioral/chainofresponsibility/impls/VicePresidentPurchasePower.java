package behavioral.chainofresponsibility.impls;

import behavioral.chainofresponsibility.interfaces.PurchasePower;

public class VicePresidentPurchasePower extends PurchasePower {

    @Override
    protected int getAllowable() {
        return BASE * 50;
    }

    @Override
    protected String getRole() {
        return "VP";
    }
}
