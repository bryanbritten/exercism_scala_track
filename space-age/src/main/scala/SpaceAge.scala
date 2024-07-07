object SpaceAge {
  def getOrbitalPeriod(planet: String): Double = {
    val earthDays = 365.25
    planet match {
      case "Mercury" => 0.2408467 * earthDays
      case "Venus" => 0.61519726 * earthDays
      case "Earth" => 1 * earthDays
      case "Mars" => 1.8808158 * earthDays
      case "Jupiter" => 11.862615 * earthDays
      case "Saturn" => 29.44798 * earthDays
      case "Uranus" => 84.016846 * earthDays
      case "Neptune" => 164.79132 * earthDays
      case _ => throw new IllegalArgumentException(s"Unknown planet: $planet")
    }
  }

  def getSpaceAge(age: Double, planet: String): Double = {
    val earthDays = getOrbitalPeriod(planet)
    age / 60 / 60 / 24 / earthDays
  }

  def onEarth(age: Double): Double = getSpaceAge(age, "Earth")

  def onVenus(age: Double): Double = getSpaceAge(age, "Venus")

  def onMercury(age: Double): Double = getSpaceAge(age, "Mercury")

  def onMars(age: Double): Double = getSpaceAge(age, "Mars")

  def onJupiter(age: Double): Double = getSpaceAge(age, "Jupiter")

  def onSaturn(age: Double): Double = getSpaceAge(age, "Saturn")

  def onUranus(age: Double): Double = getSpaceAge(age, "Uranus")

  def onNeptune(age: Double): Double = getSpaceAge(age, "Neptune")
}
