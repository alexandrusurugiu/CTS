package editare.clase;

public class StrategieSepia implements FiltruImagine {
    @Override
    public void aplicaFiltru(String numeImagine) {
        System.out.println("Applying sepia filter for the photo: " + numeImagine);
    }
}
