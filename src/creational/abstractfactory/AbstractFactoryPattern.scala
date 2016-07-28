package creational.abstractfactory

import creational.abstractfactory.interfaces.{Button, TextField, WidgetFactory, Window}
import creational.abstractfactory.metalimpl.MetalFactory
import creational.abstractfactory.simpleimpl.SimpleFactory

object AbstractFactoryPattern {

  def createGUI(factory: WidgetFactory) = {

    def fire(window: Window, button: Button, textField: TextField) = {
      window.open()
      button.click()
      println(textField.getText)
      window.close()
    }

    fire(factory.createWindow(), factory.createButton(), factory.createTextField())
  }

  def main(args: Array[String]): Unit = {
    createGUI(SimpleFactory)
    println("\nLet's change the look...\n")
    createGUI(MetalFactory)
    println("\nAnd again...\n")
    createGUI(SimpleFactory)
  }
}
