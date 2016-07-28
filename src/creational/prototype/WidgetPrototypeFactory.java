package creational.prototype;

import creational.prototype.interfaces.Widget;

public class WidgetPrototypeFactory {

    private Widget prototypeWidget;

    public WidgetPrototypeFactory() {
    }

    public WidgetPrototypeFactory setPrototypeWidget(Widget w) {
        prototypeWidget = w;
        return this;
    }

    public Widget create() {
        return prototypeWidget._clone();
    }
}
