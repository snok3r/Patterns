package behavioral.command;

import behavioral.command.commands.CheckStatusCommand;
import behavioral.command.commands.FlipDownCommand;
import behavioral.command.commands.FlipUpCommand;
import behavioral.command.commands.HighlightDisplayCommand;
import behavioral.command.invoker.*;
import behavioral.command.interfaces.Command;
import behavioral.command.interfaces.IDisplay;
import behavioral.command.interfaces.Light;
import behavioral.command.receivers.Display;
import behavioral.command.receivers.LightBulb;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandPattern {

    public static void main(String[] args) {

        Light bulb = new LightBulb();
        IDisplay display = new Display();

        Command switchUp = new FlipUpCommand(bulb);
        Command switchDown = new FlipDownCommand(bulb);
        Command checkStatus = new CheckStatusCommand(bulb, display);
        Command highlight = new HighlightDisplayCommand(display);

        Switch mySwitch = new Switch();
        mySwitch.setFlipSwitchUp(switchUp);
        mySwitch.setFlipSwitchDown(switchDown);
        mySwitch.setCheckStatus(checkStatus);
        mySwitch.setClickButton(highlight);

        try {
            while (true) {
                System.out.println("---");
                System.out.println("Choose an action:");
                System.out.println("1. Light ON");
                System.out.println("2. Light OFF");
                System.out.println("3. Highlight display");
                System.out.println("4. Check system status");
                System.out.println("0. Exit");
                System.out.println("---");
                System.out.print("> (0-4) ");

                String action = (new BufferedReader(new InputStreamReader(System.in)).readLine()).toLowerCase();
                if ("0".equals(action))
                    throw new Exception();

                switch (action) {
                    case "1":
                        mySwitch.flipUp();
                        break;
                    case "2":
                        mySwitch.flipDown();
                        break;
                    case "3":
                        mySwitch.highLightDisplay();
                        break;
                    case "4":
                        mySwitch.checkStatus();
                        break;
                }
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
