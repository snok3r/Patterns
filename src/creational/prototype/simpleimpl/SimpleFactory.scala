package creational.prototype.simpleimpl

import creational.prototype.interfaces.{Button, TextField, WidgetFactory, Window}

object SimpleFactory extends WidgetFactory {
  println("SimpleFactory instantiated")

  override def createWindow(): Window = new SimpleWindow

  override def createButton(): Button = new SimpleButton

  override def createTextField(): TextField = new SimpleTextField
}
