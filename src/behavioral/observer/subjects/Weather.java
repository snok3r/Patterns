package behavioral.observer.subjects;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.interfaces.Subject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Weather implements Subject {

    private final Set<Observer> observers;
    private String currentWeather;

    public Weather() {
        currentWeather = "";
        observers = new HashSet<>();
    }

    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
        _notify();
    }

    public String getCurrentWeather() {
        return currentWeather;
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
    public void _notify() {
        observers.forEach(Observer::update);
    }

    public void destroy() {
        observers.clear();
    }
}
