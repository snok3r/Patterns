package behavioral.chainofresponsibility.interfaces;

import behavioral.chainofresponsibility.impls.PurchaseRequest;

public abstract class PurchasePower {
    protected final int BASE = 500;
    protected PurchasePower successor;

    abstract protected int getAllowable();

    abstract protected String getRole();

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= getAllowable()) {
            System.out.println(getRole() + " will approve $" + request.getAmount() + " purchase of '" + request.getPurpose() + "'");
        } else {
            if (successor != null)
                successor.processRequest(request);
            else
                System.out.println("No one could approve the purchase request");
        }
    }
}
