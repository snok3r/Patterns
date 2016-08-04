package behavioral.state.states;

import behavioral.state.interfaces.Context;

class ConnectionClosed extends AbstractConnectionState {

    ConnectionClosed() {
        super("Closed");
    }

    @Override
    public void connect(Context c) {
        System.out.println("Connection established...");
        c.setState(ConnectionFactory.getOpenedConnection());
    }
}
