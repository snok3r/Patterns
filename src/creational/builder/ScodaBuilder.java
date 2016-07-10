package creational.builder;

public class ScodaBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        System.out.println("ScodaBuilder.buildEngine");
    }

    @Override
    public void buildTransmission() {
        System.out.println("ScodaBuilder.buildTransmission");
    }

    public void getScodaCar() {
        System.out.println("ScodaBuilder.getScodaCar");
    }
}
