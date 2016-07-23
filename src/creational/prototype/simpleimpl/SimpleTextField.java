package creational.prototype.simpleimpl;

import creational.prototype.interfaces.TextField;

class SimpleTextField implements TextField {

    public SimpleTextField() {
        System.out.println("SimpleTextField");
    }

    public SimpleTextField(SimpleTextField textField) {
        System.out.println("SimpleTextField clone");
    }

    @Override
    public String getText() {
        return "SimpleTextField.getText";
    }

    @Override
    public TextField _clone() {
        return new SimpleTextField(this);
    }
}
