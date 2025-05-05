package clase.factory;

public class DangerAirReport implements AbstractAirQualityReport {
    @Override
    public void generateReport() {
        System.out.println("Danger! The air is very polluted!");
    }
}
