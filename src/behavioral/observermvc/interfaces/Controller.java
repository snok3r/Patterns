package behavioral.observermvc.interfaces;

public interface Controller {

    void subjectChanged();

    String getInfo();

    void attach(Observer... o);

    void detach(Observer... o);
}
