package behavioral.command.commands;

import behavioral.command.interfaces.Command;
import behavioral.command.interfaces.Light;

/**
 * Concrete Command #2
 */
public class FlipDownCommand implements Command {

    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light.isOn())
            light.turnOff();
    }
}
