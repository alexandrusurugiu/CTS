package clase;

import java.util.ArrayList;
import java.util.List;

public class SearchingFilterBuilder implements IBuilder {
    private String titlu;
    private String gen;
    private int anAparitie;
    private List<String> actori;
    private float rating;
    private String regizor;

    public SearchingFilterBuilder setTitlu(String titlu) {
        this.titlu = titlu;
        return this;
    }

    public SearchingFilterBuilder setGen(String gen) {
        this.gen = gen;
        return this;
    }

    public SearchingFilterBuilder setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
        return this;
    }

    public SearchingFilterBuilder addActor(String actor) {
        this.actori.add(actor);
        return this;
    }

    public SearchingFilterBuilder setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public SearchingFilterBuilder setRegizor(String regizor) {
        this.regizor = regizor;
        return this;
    }

    public SearchingFilterBuilder() {
        this.titlu = "";
        this.gen = "";
        this.anAparitie = 0;
        this.actori = new ArrayList<>();
        this.rating = 0;
        this.regizor = "";
    }

    @Override
    public SearchingFilter build() {
        return new SearchingFilter(titlu, gen, anAparitie, actori, rating, regizor);
    }
}
