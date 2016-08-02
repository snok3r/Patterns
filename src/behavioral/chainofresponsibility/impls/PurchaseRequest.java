package behavioral.chainofresponsibility.impls;

public class PurchaseRequest {

    private final int amount;
    private final String purpose;

    public PurchaseRequest(int amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public int getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }
}
