package program;

import clase.builder.AirQualitySensor;
import clase.builder.AirQualitySensorBuilder;

public class MainBuilder {
    public static void main(String[] args) {
        AirQualitySensor s1 = new AirQualitySensorBuilder(3, 34, 20).setNivelVOC(100).build();
        AirQualitySensor s2 = new AirQualitySensorBuilder(1, 19, 30).build();
        AirQualitySensor s3 = new AirQualitySensorBuilder(2, 22, 70).setNivelVOC(20).setNivelCO(90).setNivelPM2(1).setNivelPM10(3).build();

        s1.generateReport();
        s2.generateReport();
        s3.generateReport();
    }
}
