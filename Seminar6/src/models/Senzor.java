package models;

public class Senzor implements AbstractAirQualitySensor {
    private int CO2;
    private int CO;
    private int VOC;
    private int PM2_5;
    private int PM10;
    private int temparatura;
    private int umiditate;

    @Override
    public int getCO2() {
        return this.CO2;
    }

    @Override
    public int getCO() {
        return this.CO;
    }

    @Override
    public int getVOC() {
        return this.VOC;
    }

    @Override
    public int getPM2_5() {
        return this.PM2_5;
    }

    @Override
    public int getPM10() {
        return this.getPM10();
    }

    @Override
    public int getTemparatura() {
        return this.temparatura;
    }

    @Override
    public int getUmiditate() {
        return this.umiditate;
    }

    void setCO2(int CO2) {
        this.CO2 = CO2;
    }

    void setCO(int CO) {
        this.CO = CO;
    }

    void setVOC(int VOC) {
        this.VOC = VOC;
    }

    void setPM2_5(int PM2_5) {
        this.PM2_5 = PM2_5;
    }

    void setPM10(int PM10) {
        this.PM10 = PM10;
    }

    void setTemparatura(int temparatura) {
        this.temparatura = temparatura;
    }

    void setUmiditate(int umiditate) {
        this.umiditate = umiditate;
    }

    Senzor(int CO2, int CO, int VOC, int PM2_5, int PM10, int temparatura, int umiditate) {
        this.CO2 = CO2;
        this.CO = CO;
        this.VOC = VOC;
        this.PM2_5 = PM2_5;
        this.PM10 = PM10;
        this.temparatura = temparatura;
        this.umiditate = umiditate;
    }

    @Override
    public String toString() {
        return "Senzor{" +
                "CO2=" + CO2 +
                ", CO=" + CO +
                ", VOC=" + VOC +
                ", PM2_5=" + PM2_5 +
                ", PM10=" + PM10 +
                ", temparatura=" + temparatura +
                ", umiditate=" + umiditate +
                '}';
    }
}
