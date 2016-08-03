package behavioral.observer.observers;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.subjects.Weather;

public class CaresForSunny implements Observer {

    private final Weather weather;

    public CaresForSunny(Weather weather) {
        this.weather = weather;
        this.weather.attach(this);
    }

    @Override
    public void update() {
        if ("sunny".equals(weather.getCurrentWeather().toLowerCase()))
            System.out.println("CaresForSunny: Alright, it's sunny now!");
    }

    public void destroy() {
        weather.detach(this);
    }
}
