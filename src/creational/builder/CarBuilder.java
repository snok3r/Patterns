package creational.builder;

public class CarBuilder {
    protected CarBuilder() {
    }

    public void buildEngine() {
        System.out.println("CarBuilder.buildEngine");
    }

    public void buildWindows() {
        System.out.println("CarBuilder.buildWindows");
    }

    public void buildTransmission() {
        System.out.println("CarBuilder.buildTransmission");
    }

    public void buildRoof() {
        System.out.println("CarBuilder.buildRoof");
    }

    public void getCar() {
        System.out.println("CarBuilder.getCar");
    }
}
