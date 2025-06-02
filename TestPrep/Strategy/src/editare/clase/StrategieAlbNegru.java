package editare.clase;

public class StrategieAlbNegru implements FiltruImagine {
    @Override
    public void aplicaFiltru(String numeImagine) {
        System.out.println("Applying black & white filter for the photo: " + numeImagine);
    }
}
