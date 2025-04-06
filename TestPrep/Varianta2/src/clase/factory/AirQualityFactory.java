package clase.factory;

public class AirQualityFactory {
    public static AbstractAirQualityReport getAirQualityReport(int particleCount) {
        if (particleCount > 0 && particleCount <= 30) {
            return new FreshAirReport();
        } else if (particleCount > 30 && particleCount <= 70) {
            return new WarningAirReport();
        } else {
            return new DangerAirReport();
        }
    }
}
