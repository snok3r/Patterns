package creational.builder

object Main {
  def main(args: Array[String]): Unit = {
    val autoDealer = new AutoDealer

    val bmwBuilder = new BMWBuilder
    println("Roofless car:")
    autoDealer.carWithoutRoof(bmwBuilder)
    autoDealer.getCar(bmwBuilder);
    //bmwBuilder.getCar()

    val scodaBuilder = new ScodaBuilder
    println("\nCar with roof:")
    autoDealer.carWithRoof(scodaBuilder)
    autoDealer.getCar(scodaBuilder);
    //scodaBuilder.getCar()
  }
}
