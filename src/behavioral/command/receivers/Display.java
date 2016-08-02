package behavioral.command.receivers;

import behavioral.command.interfaces.IDisplay;

/**
 * Receiver #2
 */
public class Display implements IDisplay {

    private boolean highlighted;

    @Override
    public boolean isHighlighted() {
        return highlighted;
    }

    @Override
    public void highlight() {
        System.err.println("Display.highlight");
        highlighted = true;
    }
}
