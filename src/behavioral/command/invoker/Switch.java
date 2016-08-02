package behavioral.command.invoker;

import behavioral.command.interfaces.Command;

import java.util.Optional;

/**
 * Invoker
 */
public class Switch {

    private Command flipSwitchUp;
    private Command flipSwitchDown;
    private Command clickButton;
    private Command checkStatus;

    public Switch() {
    }

    public Switch(Command flipUp, Command flipDown, Command button, Command status) {
        flipSwitchUp = flipUp;
        flipSwitchDown = flipDown;
        clickButton = button;
        checkStatus = status;
    }

    public void flipUp() {
        action(flipSwitchUp);
    }

    public void flipDown() {
        action(flipSwitchDown);
    }

    public void highLightDisplay() {
        action(clickButton);
    }

    public void checkStatus() {
        action(checkStatus);
    }

    // private methods

    private String notSetMessage() {
        return "Action not set";
    }

    private void action(Command c) {
        Optional.ofNullable(c)
                .orElse(() -> System.err.println(notSetMessage()))
                .execute();
    }

    // setters

    public void setFlipSwitchUp(Command flipUp) {
        flipSwitchUp = flipUp;
    }

    public void setFlipSwitchDown(Command flipDown) {
        flipSwitchDown = flipDown;
    }

    public void setClickButton(Command button) {
        clickButton = button;
    }

    public void setCheckStatus(Command status) {
        checkStatus = status;
    }
}
