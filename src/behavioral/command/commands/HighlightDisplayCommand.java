package behavioral.command.commands;

import behavioral.command.interfaces.Command;
import behavioral.command.interfaces.IDisplay;

/**
 * Concrete Command #4
 */
public class HighlightDisplayCommand implements Command {

    private IDisplay display;

    public HighlightDisplayCommand(IDisplay display) {
        this.display = display;
    }

    public void setDisplay(IDisplay display) {
        this.display = display;
    }

    @Override
    public void execute() {
        display.highlight();
    }
}
