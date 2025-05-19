package chain_of_responsibility.clase;

import java.util.List;

public abstract class Filtrare {
    protected Filtrare nextHandler;

    public void setNextHandler(Filtrare nextHandler) {
        this.nextHandler = nextHandler;
    }

//    public abstract List<Candidat> filter(List<Candidat> lista);

    public abstract void filter(List<Candidat> lista);
}
