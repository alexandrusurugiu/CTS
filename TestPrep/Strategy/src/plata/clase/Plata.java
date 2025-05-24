package plata.clase;

public class Plata {
    private double suma;
    private String moneda;

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Plata(double suma, String moneda) {
        this.suma = suma;
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Plata{" +
                "suma=" + suma +
                ", moneda='" + moneda + '\'' +
                '}';
    }
}
