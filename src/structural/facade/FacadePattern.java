package structural.facade;

public class FacadePattern {

    public static boolean debug = false;

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.start();
    }
}
