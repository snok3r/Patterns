package behavioral.observer.observers;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.subjects.Weather;

public class People implements Observer {

    private final Weather weather;

    public People(Weather weather) {
        this.weather = weather;
        this.weather.attach(this);
    }

    @Override
    public void update() {
        System.out.println("People: wow it's " + weather.getCurrentWeather());
    }

    public void destroy() {
        weather.detach(this);
    }
}
