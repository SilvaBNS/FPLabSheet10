object Q1 {
  def main(args : Array[String]) : Unit = {
    val inputTemperatures = List(0.00, 10, 20, 30)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(f"Average Fahrenheit temperature: $averageFahrenheit%.2f")

  }

  def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9 / 5) + 32)
    val totalFahrenheit = fahrenheitTemperatures.reduce((acc, temp) => acc + temp)
    val averageFahrenheit = totalFahrenheit / temperatures.length
    averageFahrenheit
  }

}
