package creational.builder;

import creational.builder.builders.CarBuilder;

/* Director */
public class AutoDealer {

    public void carWithoutRoof(CarBuilder builder) {
        builder.buildEngine();
        builder.buildTransmission();
        builder.buildWindows();
    }

    public void carWithRoof(CarBuilder builder) {
        carWithoutRoof(builder);

        builder.buildRoof();
    }

    public void getCar(CarBuilder builder) {
        builder.getCar();
    }
}
