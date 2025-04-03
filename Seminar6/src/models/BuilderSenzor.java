package models;

public class BuilderSenzor implements IBuilder{
//    private Senzor senzor;  - obiectul construit
    private int CO2;
    private int CO;
    private int VOC;
    private int PM2_5;
    private int PM10;
    private int temparatura;
    private int umiditate;
    @Override
    public AbstractAirQualitySensor build() {
        Senzor senzor = new Senzor(this.CO2, this.CO, this.VOC, this.PM2_5, this.PM10, this.temparatura, this.umiditate);

        this.umiditate = 0;
        this.CO = 0;
        this.CO2 = 0;
        this.PM10 = 0;
        this.PM2_5 = 0;
        this.VOC = 0;

        return senzor;
    }

    //Primim ca parametrii fieldurile obligatorii din clasa de baza
    public BuilderSenzor(int temparatura) {
        this.temparatura = temparatura;
    }

    //se adauga setteri pentru fiecare camp optional
    public BuilderSenzor setCO2(int CO2) {
        this.CO2 = CO2;
        return this;
    }

    public BuilderSenzor setCO(int CO) {
        this.CO = CO;
        return this;
    }

    public BuilderSenzor setVOC(int VOC) {
        this.VOC = VOC;
        return this;
    }

    public BuilderSenzor setPM2_5(int PM2_5) {
        this.PM2_5 = PM2_5;
        return this;
    }

    public BuilderSenzor setPM10(int PM10) {
        this.PM10 = PM10;
        return this;
    }

    public BuilderSenzor setUmiditate(int umiditate) {
        this.umiditate = umiditate;
        return this;
    }
}
