package behavioral.mediator;

import behavioral.mediator.widgets.Button;
import behavioral.mediator.widgets.ListBox;
import behavioral.mediator.widgets.TextField;
import behavioral.mediator.widgetsmediators.WidgetDirector;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MediatorPattern {

    private static void start(WidgetDirector director) {
        director.createWidgets();
        director.showDialog();

        Button okBtn = director.getOkButton();
        Button cancelBtn = director.getCancelButton();
        ListBox listBox = director.getListBox();
        TextField textField = director.getTextField();

        try {
            while (true) {
                System.out.println("---");
                System.out.println("Choose an action:");
                System.out.println("1. Select ListBox item");
                System.out.println("2. Type in text TextField");
                System.out.println("3. Click OK Button");
                System.out.println("4. Click Cancel Button");
                System.out.println("0. Exit");
                System.out.println("---");
                System.out.print("> (0-4) ");

                String action = (new BufferedReader(new InputStreamReader(System.in)).readLine()).toLowerCase();
                if ("0".equals(action))
                    throw new Exception();

                switch (action) {
                    case "1":
                        listBox.changed();
                        break;
                    case "2":
                        System.out.print("> (text to put) ");
                        String text = (new BufferedReader(new InputStreamReader(System.in)).readLine());
                        textField.setText(text);
                        break;
                    case "3":
                        okBtn.changed();
                        break;
                    case "4":
                        cancelBtn.changed();
                        break;
                }
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        start(new WidgetDirector());
    }
}
