package behavioral.mediator.interfaces;

public class Widget {
    private final Director director;

    protected Widget(Director director) {
        this.director = director;
    }

    public void changed() {
        director.widgetChanged(this);
    }
}
