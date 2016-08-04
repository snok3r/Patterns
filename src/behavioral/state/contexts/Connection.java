package behavioral.state.contexts;

import behavioral.state.interfaces.Context;
import behavioral.state.interfaces.State;
import behavioral.state.states.ConnectionFactory;

public class Connection implements Context {

    private State state;

    public Connection() {
        state = ConnectionFactory.getClosedConnection();
    }

    @Override
    public void listen(int port) {
        state.listen(this, port);
    }

    @Override
    public void open() {
        state.connect(this);
    }

    @Override
    public void close() {
        state.close(this);
    }

    @Override
    public void setState(State s) {
        state = s;
    }

    @Override
    public String status() {
        return state.status();
    }
}
