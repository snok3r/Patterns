package behavioral.mediator.widgets;

import behavioral.mediator.interfaces.Director;
import behavioral.mediator.interfaces.Widget;

public class TextField extends Widget {

    public TextField(Director director) {
        super(director);
    }

    public void setText(String text) {
        System.out.println("TextField.setText: '" + text + "'");
        changed();
    }
}
