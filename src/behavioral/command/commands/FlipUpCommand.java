package behavioral.command.commands;

import behavioral.command.interfaces.Command;
import behavioral.command.interfaces.Light;

/**
 * Concrete Command #1
 */
public class FlipUpCommand implements Command {

    private Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (!light.isOn())
            light.turnOn();
    }
}
