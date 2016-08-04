package behavioral.state.states;

import behavioral.state.interfaces.State;

public class ConnectionFactory {

    private static final State connectionClosed = new ConnectionClosed();
    private static final State connectionOpened = new ConnectionOpened();

    private ConnectionFactory() {
    }

    public static State getOpenedConnection() {
        return connectionOpened;
    }

    public static State getClosedConnection() {
        return connectionClosed;
    }
}
