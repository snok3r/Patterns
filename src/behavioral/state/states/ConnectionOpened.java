package behavioral.state.states;

import behavioral.state.interfaces.Context;

class ConnectionOpened extends AbstractConnectionState {

    ConnectionOpened() {
        super("Opened");
    }

    @Override
    public void listen(Context c, int port) {
        System.out.println("Listening " + port + "...");
    }

    @Override
    public void close(Context c) {
        System.out.println("Closing connection...");
        c.setState(ConnectionFactory.getClosedConnection());
    }
}
