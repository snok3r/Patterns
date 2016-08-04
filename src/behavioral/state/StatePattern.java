package behavioral.state;

import behavioral.state.contexts.Connection;
import behavioral.state.interfaces.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StatePattern {

    private static void start(Context context) {
        try {
            while (true) {
                System.out.println("---");
                System.out.println("Choose an action:");
                System.out.println("1. Open connection");
                System.out.println("2. Listen port");
                System.out.println("3. Check connection status");
                System.out.println("4. Close connection");
                System.out.println("0. Exit");
                System.out.println("---");
                System.out.print("> (0-4) ");

                String action = (new BufferedReader(new InputStreamReader(System.in)).readLine()).toLowerCase();
                if ("0".equals(action))
                    throw new Exception();

                switch (action) {
                    case "1":
                        context.open();
                        break;
                    case "2":
                        System.out.print("> (port number) ");
                        int port = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                        context.listen(port);
                        break;
                    case "3":
                        System.out.println(context.status());
                        break;
                    case "4":
                        context.close();
                        break;
                }
            }
        } catch (Exception e) {
            context.close();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        start(new Connection());
    }
}
