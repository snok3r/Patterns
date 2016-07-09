package creational.abstractfactory.metalimpl;

import creational.abstractfactory.interfaces.TextField;

class MetalTextField implements TextField {
    @Override
    public String getText() {
        return "MetalTextField.getText";
    }
}
