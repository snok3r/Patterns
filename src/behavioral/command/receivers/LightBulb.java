package behavioral.command.receivers;

import behavioral.command.interfaces.Light;

/**
 * Receiver #1
 */
public class LightBulb implements Light {

    private boolean on = false;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        System.err.println("LightBulb.turnOn");
        on = true;
    }

    @Override
    public void turnOff() {
        System.err.println("LightBulb.turnOff");
        on = false;
    }
}
