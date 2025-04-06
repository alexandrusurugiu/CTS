package clase.factory;

public class WarningAirReport implements AbstractAirQualityReport {
    @Override
    public void generateReport() {
        System.out.println("Warning! The air is a little polluted!");
    }
}
