package hotel.clase;

import java.util.HashSet;
import java.util.Set;

public class Camera {
    private int numar;
    private String tip;
    private Set<String> dateRezervate;

    public Camera(int numar, String tip) {
        this.numar = numar;
        this.tip = tip;
        this.dateRezervate = new HashSet<>();
    }

    public boolean esteDisponibila(String data) {
        return true;
    }

    public void rezerva(String data) {
        dateRezervate.add(data);
    }

    public String getTip() {
        return tip;
    }
}
