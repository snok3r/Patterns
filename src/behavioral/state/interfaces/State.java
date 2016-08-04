package behavioral.state.interfaces;

public interface State {

    void connect(Context c);

    void listen(Context c, int port);

    void close(Context c);

    String status();
}
