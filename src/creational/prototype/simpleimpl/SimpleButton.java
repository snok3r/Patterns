package creational.prototype.simpleimpl;

import creational.prototype.interfaces.Button;

class SimpleButton implements Button {

    public SimpleButton() {
        System.out.println("SimpleButton");
    }

    public SimpleButton(SimpleButton button) {
        System.out.println("SimpleButton clone");
    }

    @Override
    public void click() {
        System.out.println("SimpleButton.click");
    }

    @Override
    public Button _clone() {
        return new SimpleButton(this);
    }
}
