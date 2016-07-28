package creational.factorymethod

import creational.factorymethod.creators.{BurgerCreator, PizzaCreator, ProductCreator}

object FactoryMethodPattern {
  def main(args: Array[String]): Unit = {

    def createProduct(productCreator: ProductCreator) = productCreator.createProduct()

    val burger = createProduct(new BurgerCreator)
    val pizza = createProduct(new PizzaCreator)

    burger.eat()
    pizza.eat()
  }
}
