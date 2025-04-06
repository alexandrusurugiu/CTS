package program;

import clase.factory.AbstractAirQualityReport;
import clase.factory.AirQualityFactory;

public class MainFactory {
    public static void main(String[] args) {
        AbstractAirQualityReport report1 = AirQualityFactory.getAirQualityReport(4);
        AbstractAirQualityReport report2 = AirQualityFactory.getAirQualityReport(70);

        report1.generateReport();
        report2.generateReport();
    }
}