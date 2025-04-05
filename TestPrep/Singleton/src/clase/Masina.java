package clase;

public class Masina implements IMasina {
    private String modelMasina;
    private int anFabricatie;

    @Override
    public String getModelMasina() {
        return modelMasina;
    }

    @Override
    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setModelMasina(String modelMasina) {
        this.modelMasina = modelMasina;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public Masina(String modelMasina, int anFabricatie) {
        this.modelMasina = modelMasina;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "modelMasina='" + modelMasina + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
