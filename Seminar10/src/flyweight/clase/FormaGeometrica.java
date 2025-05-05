package flyweight.clase;

public class FormaGeometrica implements IDesenare {
    private Tip tip;
    private String detaliiDesenare;

    @Override
    public void deseneaza(int x, int y) {
        System.out.println("S-a desenat " + tip + " la coordonatele (" + x + "," + y + ") cu detalii: " + detaliiDesenare);
    }

    public FormaGeometrica(Tip tip, String detaliiDesenare) {
        this.tip = tip;
        this.detaliiDesenare = detaliiDesenare;
    }
}
