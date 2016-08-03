package behavioral.observer;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.observers.CaresForSunny;
import behavioral.observer.observers.Machine;
import behavioral.observer.observers.People;
import behavioral.observer.subjects.Weather;

import java.util.Arrays;
import java.util.List;

public class ObserverPattern {

    public static void main(String[] args) {

        Weather weather = new Weather();
        List<Observer> observers = Arrays.asList(
                new Machine(weather),
                new People(weather),
                new CaresForSunny(weather)
        );

        weather.setCurrentWeather("raining");
        weather.setCurrentWeather("sunny");
        weather.setCurrentWeather("cloudy");

        observers.forEach(Observer::destroy);
        weather.destroy();
    }
}
