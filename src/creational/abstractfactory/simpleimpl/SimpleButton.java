package creational.abstractfactory.simpleimpl;

import creational.abstractfactory.interfaces.Button;

class SimpleButton implements Button {
    @Override
    public void click() {
        System.out.println("SimpleButton.click");
    }
}
