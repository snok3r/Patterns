package behavioral.observer.observers;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.subjects.Weather;

import java.util.Arrays;

public class Machine implements Observer {

    private final Weather weather;

    public Machine(Weather weather) {
        this.weather = weather;
        this.weather.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Machine: " + Arrays.toString(weather.getCurrentWeather().getBytes()));
    }

    public void destroy() {
        weather.detach(this);
    }
}
