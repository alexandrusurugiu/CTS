package models;

public abstract interface AbstractAirQualitySensor {
    int getCO2();
    int getCO();
    int getVOC();
    int getPM2_5();
    int getPM10();
    int getTemparatura();
    int getUmiditate();
}
