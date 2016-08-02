package behavioral.chainofresponsibility.impls;

import behavioral.chainofresponsibility.interfaces.PurchasePower;

public class DirectorPurchasePower extends PurchasePower {

    @Override
    protected int getAllowable() {
        return BASE * 20;
    }

    @Override
    protected String getRole() {
        return "Director";
    }
}
