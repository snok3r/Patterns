package behavioral.observermvc.subjects;

import behavioral.observermvc.interfaces.Controller;
import behavioral.observermvc.interfaces.Subject;

public class Weather implements Subject {

    private Controller controller;

    private String currentWeather;

    public Weather() {
        currentWeather = "";
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
        _notify();
    }

    public String getCurrentWeather() {
        return currentWeather;
    }

    @Override
    public void _notify() {
        if (controller != null)
            controller.subjectChanged();
    }
}
