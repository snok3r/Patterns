package creational.prototype.interfaces;

public interface Window extends Widget {
    void open();

    void close();

    Window _clone();
}
