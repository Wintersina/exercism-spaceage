import scala.math.BigDecimal
object SpaceAge {

    def getPlanetAge(seconds: Double): Double = {
        val year = seconds/31557600
        year
    }

    def onEarth(seconds : Double) = getPlanetAge(seconds)
    def onMercury(seconds: Double) = getPlanetAge(seconds)/0.2408467;
    def onVenus(seconds: Double) = getPlanetAge(seconds)/0.61519726
    def onMars(seconds: Double) = getPlanetAge(seconds)/1.8808158 
    def onJupiter(seconds: Double) = getPlanetAge(seconds)/11.862615 
    def onSaturn(seconds: Double)  = getPlanetAge(seconds)/29.447498
    def onUranus(seconds: Double)  = getPlanetAge(seconds)/ 84.016846 
    def onNeptune(seconds: Double) = getPlanetAge(seconds)/164.79132
}
