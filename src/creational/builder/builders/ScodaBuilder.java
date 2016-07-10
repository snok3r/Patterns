package creational.builder.builders;

public class ScodaBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        System.out.println("ScodaBuilder.buildEngine");
    }

    @Override
    public void buildTransmission() {
        System.out.println("ScodaBuilder.buildTransmission");
    }

    @Override
    public void getCar() {
        System.out.println("ScodaBuilder.getCar");
    }
}
