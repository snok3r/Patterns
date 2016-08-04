package behavioral.state.states;

import behavioral.state.interfaces.Context;
import behavioral.state.interfaces.State;

class AbstractConnectionState implements State {

    private final String status;

    AbstractConnectionState(String status) {
        this.status = status;
    }

    @Override
    public void connect(Context c) {
    }

    @Override
    public void listen(Context c, int port) {
    }

    @Override
    public void close(Context c) {
    }


    public String status() {
        return status;
    }
}
