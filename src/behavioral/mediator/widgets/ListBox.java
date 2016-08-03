package behavioral.mediator.widgets;

import behavioral.mediator.interfaces.Director;
import behavioral.mediator.interfaces.Widget;

public class ListBox extends Widget {

    public ListBox(Director director) {
        super(director);
    }

    public String getSelection() {
        return "listbox item";
    }
}
