package editare.clase;

public class StrategieContrast implements FiltruImagine {
    @Override
    public void aplicaFiltru(String numeImagine) {
        System.out.println("Applying contrast incrementation for the photo: " + numeImagine);
    }
}
