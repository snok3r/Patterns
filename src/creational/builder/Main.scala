package creational.builder

object Main {
  def main(args: Array[String]): Unit = {
    val director = new Director
    val bmwBuilder = new BMWBuilder

    println("Roofless car:")
    director.carWithoutRoof(bmwBuilder)
    bmwBuilder.getBMWCar()

    val scodaBuilder = new ScodaBuilder
    println("\nCar with roof:")
    director.carWithRoof(scodaBuilder)
    scodaBuilder.getScodaCar()
  }
}
