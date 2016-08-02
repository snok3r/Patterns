package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.impls.*;
import behavioral.chainofresponsibility.interfaces.PurchasePower;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoRPattern {

    public static void main(String[] args) {
        PurchasePower manager = new ManagerPurchasePower();
        PurchasePower director = new DirectorPurchasePower();
        PurchasePower vp = new VicePresidentPurchasePower();
        PurchasePower president = new PresidentPurchasePower();

        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure ('q' to exit)");
                System.out.print("> ");
                int amount = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(amount, "General"));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
