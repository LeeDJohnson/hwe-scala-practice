package com.farrellw.hwe.practice

case class Item(description: String, price: Option[Int])

case class WeatherStation(name: String, temperature: Option[Int])

object OptionEither {
  /*
    Returns age of a dog when given a human age.
    Returns None if the input is None.
  */
  def dogAge(humanAge: Option[Int]): Option[Int] = {
    humanAge.map(x => {
      x * 7
    })
  }

  /*
    Returns the total cost af any item.
    If that item has a price, then the price + 7% of the price should be returned.
  */
  def totalCost(item: Item): Option[Double] = {
    if (item.price.isDefined) {
      Some(item.price.get * 1.07)
    } else {
      None
    }
  }


  /*
    Given a list of weather temperatures, calculates the average temperature across all weather stations.
    Some weather stations don't report temperature
    Returns None if the list is empty or no weather stations contain any temperature reading.
   */
  def averageTemperature(temperatures: List[WeatherStation]): Option[Int] = {
    val withData = temperatures.filter(data => data.temperature.isDefined)
    if (withData.isEmpty) {
      None
    } else {
      val numberOfStations = withData.length
      val sum = withData.map(temp => {
        temp.temperature.get
      }).sum
      val average = sum / numberOfStations
      Some(average)
    }
  }
}
