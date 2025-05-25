package editare.clase;

public class Strategie {
    private FiltruImagine filtruImagine;

    public void setFiltruImagine(FiltruImagine filtruImagine) {
        this.filtruImagine = filtruImagine;
    }

    public void proceseazaImagine(String nume) {
        if (filtruImagine != null) {
            filtruImagine.aplicaFiltru(nume);
        } else {
            System.out.println("There is no selected strategy!");
        }
    }
}
