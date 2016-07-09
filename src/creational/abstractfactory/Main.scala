package creational.abstractfactory

import creational.abstractfactory.interfaces.{Button, WidgetFactory, Window}
import creational.abstractfactory.metalimpl.MetalFactory
import creational.abstractfactory.simpleimpl.SimpleFactory

object Main {

  def createGUI(factory: WidgetFactory) = {
    def fire(window: Window, button: Button) = {
      window.open()
      button.click()
      window.close()
    }

    fire(factory.createWindow(), factory.createButton())

    println(factory.createTextField().getText)
  }

  def main(args: Array[String]): Unit = {
    createGUI(SimpleFactory)
    createGUI(MetalFactory)
  }
}
