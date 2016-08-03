package behavioral.observermvc.controller;

import behavioral.observermvc.interfaces.Controller;
import behavioral.observermvc.interfaces.Observer;
import behavioral.observermvc.subjects.Weather;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Mediator
 */
public class WeatherController implements Controller {

    private final Set<Observer> observers;
    private Weather weather;

    public WeatherController() {
        observers = new HashSet<>();
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void attach(Observer... o) {
        observers.addAll(Arrays.asList(o));
    }

    @Override
    public void detach(Observer... o) {
        observers.removeAll(Arrays.asList(o));
    }

    @Override
    public void subjectChanged() {
        observers.forEach(Observer::update);
    }

    @Override
    public String getInfo() {
        return weather.getCurrentWeather();
    }

    public void destroy() {
        observers.clear();
    }
}
