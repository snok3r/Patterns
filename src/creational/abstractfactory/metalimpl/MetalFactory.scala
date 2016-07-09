package creational.abstractfactory.metalimpl

import creational.abstractfactory.interfaces.{Button, TextField, WidgetFactory, Window}

object MetalFactory extends WidgetFactory {
  override def createWindow(): Window = new MetalWindow

  override def createButton(): Button = new MetalButton

  override def createTextField(): TextField = new MetalTextField
}
