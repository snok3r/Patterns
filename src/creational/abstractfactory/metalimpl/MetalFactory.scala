package creational.abstractfactory.metalimpl

import creational.abstractfactory.interfaces.{Button, TextField, Window}
import creational.abstractfactory.interfaces.WidgetFactory

object MetalFactory extends WidgetFactory {
  println("MetalFactory instantiated")

  override def createWindow(): Window = new MetalWindow

  override def createButton(): Button = new MetalButton

  override def createTextField(): TextField = new MetalTextField
}
