package creational.builder;

public class BMWBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        System.out.println("BMWBuilder.buildEngine");
    }

    @Override
    public void buildWindows() {
        System.out.println("BMWBuilder.buildWindows");
    }

    @Override
    public void buildTransmission() {
        System.out.println("BMWBuilder.buildTransmission");
    }

    @Override
    public void buildRoof() {
        System.out.println("BMWBuilder.buildRoof");
    }

    @Override
    public void getCar() {
        System.out.println("BMWBuilder.getCar");
    }
}
