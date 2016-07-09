package creational.abstractfactory.metalimpl;

import creational.abstractfactory.interfaces.Button;

class MetalButton implements Button {
    @Override
    public void click() {
        System.out.println("MetalButton.click");
    }
}
