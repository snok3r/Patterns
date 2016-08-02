package behavioral.command.commands;

import behavioral.command.interfaces.Command;
import behavioral.command.interfaces.IDisplay;
import behavioral.command.interfaces.Light;

/**
 * Concrete Command #3
 */
public class CheckStatusCommand implements Command {

    private Light light;
    private IDisplay display;

    public CheckStatusCommand(Light light, IDisplay display) {
        this.light = light;
        this.display = display;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void setDisplay(IDisplay display) {
        this.display = display;
    }

    @Override
    public void execute() {
        String lightStatus = light.isOn() ? "ON" : "OFF";
        System.err.println("Light is " + lightStatus);

        String displayStatus = display.isHighlighted() ? "highlighted" : "not highlighted";
        System.err.println("Display is " + displayStatus);
    }
}
