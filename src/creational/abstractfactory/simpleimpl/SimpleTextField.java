package creational.abstractfactory.simpleimpl;

import creational.abstractfactory.interfaces.TextField;

class SimpleTextField implements TextField {
    @Override
    public String getText() {
        return "SimpleTextField.getText";
    }
}
