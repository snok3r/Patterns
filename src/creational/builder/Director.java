package creational.builder;

public class Director {

    public void carWithoutRoof(CarBuilder builder) {
        builder.buildEngine();
        builder.buildTransmission();
        builder.buildWindows();
    }

    public void carWithRoof(CarBuilder builder) {
        carWithoutRoof(builder);

        builder.buildRoof();
    }
}
