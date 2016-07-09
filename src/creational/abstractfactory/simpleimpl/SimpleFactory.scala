package creational.abstractfactory.simpleimpl

import creational.abstractfactory.interfaces.{Button, TextField, WidgetFactory, Window}

object SimpleFactory extends WidgetFactory {
  override def createWindow(): Window = new SimpleWindow

  override def createButton(): Button = new SimpleButton

  override def createTextField(): TextField = new SimpleTextField
}
