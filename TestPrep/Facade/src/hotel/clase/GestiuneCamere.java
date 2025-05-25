package hotel.clase;

import java.util.ArrayList;

public class GestiuneCamere {
    private ArrayList<Camera> camere = new ArrayList<>();

    public void adaugaCamera(Camera c) {
        camere.add(c);
    }

    public ArrayList<Camera> getCamere() {
        return camere;
    }
}
