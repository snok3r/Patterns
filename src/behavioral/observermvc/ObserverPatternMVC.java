package behavioral.observermvc;

import behavioral.observermvc.controller.WeatherController;
import behavioral.observermvc.observers.CaresForSunny;
import behavioral.observermvc.observers.Machine;
import behavioral.observermvc.observers.People;
import behavioral.observermvc.subjects.Weather;

public class ObserverPatternMVC {

    public static void main(String[] args) {

        Weather weather = new Weather();
        WeatherController controller = new WeatherController();

        // linking mvc
        controller.setWeather(weather);
        weather.setController(controller);
        controller.attach(new Machine(controller),
                new People(controller),
                new CaresForSunny(controller)
        );

        weather.setCurrentWeather("raining");
        weather.setCurrentWeather("sunny");
        weather.setCurrentWeather("cloudy");

        controller.destroy();
    }
}
