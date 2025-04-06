package clase.builder;

import clase.factory.AbstractAirQualityReport;

public class AirQualitySensor implements AbstractAirQualityReport {
    private int nivelPM2;
    private int nivelPM10;
    private int nivelVOC;
    private int nivelCO2;
    private int nivelCO;
    private int temperatura;
    private int umiditate;

    AirQualitySensor(int nivelPM2, int nivelPM10, int nivelVOC, int nivelCO2, int nivelCO, int temperatura, int umiditate) {
        this.nivelPM2 = nivelPM2;
        this.nivelPM10 = nivelPM10;
        this.nivelVOC = nivelVOC;
        this.nivelCO2 = nivelCO2;
        this.nivelCO = nivelCO;
        this.temperatura = temperatura;
        this.umiditate = umiditate;
    }

    @Override
    public void generateReport() {
        System.out.println("Nivel PM2.5: " + nivelPM2 + ", nivel PM10: " + nivelPM10 + ", nivel VOC: " + nivelVOC + ", nivel CO2: " + nivelCO2 + ", nivel CO: " + nivelCO + ", nivel temperatura: " + temperatura + ", nivel temperatura: " + temperatura + ", nivel umiditate: " + umiditate);
    }
}
