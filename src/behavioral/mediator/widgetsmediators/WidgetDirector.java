package behavioral.mediator.widgetsmediators;

import behavioral.mediator.interfaces.Director;
import behavioral.mediator.interfaces.Widget;
import behavioral.mediator.widgets.Button;
import behavioral.mediator.widgets.ListBox;
import behavioral.mediator.widgets.TextField;

public class WidgetDirector implements Director {

    private Button ok;
    private Button cancel;
    private ListBox listBox;
    private TextField textField;

    @Override
    public void widgetChanged(Widget w) {
        if (w == ok) {
            System.out.println("OK button clicked");
        } else if (w == cancel) {
            System.out.println("Cancel button clicked");
        } else if (w == listBox) {
            System.out.println("ListBox item selected");
            textField.setText(listBox.getSelection());
        } else if (w == textField) {
            System.out.println("TextField changed");
        }
    }

    @Override
    public void showDialog() {
        System.out.println("WidgetDirector.showDialog");
    }

    @Override
    public void createWidgets() {
        System.out.println("WidgetDirector.createWidgets");

        ok = new Button(this);
        cancel = new Button(this);
        listBox = new ListBox(this);
        textField = new TextField(this);
    }

    public Button getOkButton() {
        return ok;
    }

    public Button getCancelButton() {
        return cancel;
    }

    public ListBox getListBox() {
        return listBox;
    }

    public TextField getTextField() {
        return textField;
    }
}
