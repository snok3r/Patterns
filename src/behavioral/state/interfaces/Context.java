package behavioral.state.interfaces;

public interface Context {

    void setState(State s);

    void listen(int port);

    void open();

    void close();

    String status();
}
