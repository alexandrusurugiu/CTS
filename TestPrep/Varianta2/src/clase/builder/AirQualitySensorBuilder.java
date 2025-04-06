package clase.builder;

public class AirQualitySensorBuilder {
    private int nivelPM2;
    private int nivelPM10;
    private int nivelVOC;
    private int nivelCO2;
    private int nivelCO;
    private int temperatura;
    private int umiditate;

    public AirQualitySensorBuilder setNivelPM2(int nivelPM2) {
        this.nivelPM2 = nivelPM2;
        return this;
    }

    public AirQualitySensorBuilder setNivelPM10(int nivelPM10) {
        this.nivelPM10 = nivelPM10;
        return this;
    }

    public AirQualitySensorBuilder setNivelVOC(int nivelVOC) {
        this.nivelVOC = nivelVOC;
        return this;
    }

    public AirQualitySensorBuilder setNivelCO(int nivelCO) {
        this.nivelCO = nivelCO;
        return this;
    }

    public AirQualitySensorBuilder(int co2, int temperatura, int umiditate) {
        this.nivelCO2 = co2;
        this.temperatura = temperatura;
        this.umiditate = umiditate;
        this.nivelPM2 = 0;
        this.nivelPM10 = 0;
        this.nivelVOC = 0;
        this.nivelCO = 0;
    }

    public AirQualitySensor build() {
        return new AirQualitySensor(nivelPM2, nivelPM10, nivelVOC, nivelCO, nivelCO2, temperatura, umiditate);
    }
}
