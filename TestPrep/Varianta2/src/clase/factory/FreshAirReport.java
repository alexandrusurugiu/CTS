package clase.factory;

public class FreshAirReport implements AbstractAirQualityReport {
    @Override
    public void generateReport() {
        System.out.println("The air is clean!");
    }
}
