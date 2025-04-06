package clase;

import java.util.List;

public class SearchingFilter {
    private final String titlu;
    private final String gen;
    private final int anAparitie;
    private final List<String> actori;
    private final float rating;
    private final String regizor;

    SearchingFilter(String titlu, String gen, int anAparitie, List<String> actori, float rating, String regizor) {
        this.titlu = titlu;
        this.gen = gen;
        this.anAparitie = anAparitie;
        this.actori = actori;
        this.rating = rating;
        this.regizor = regizor;
    }

    @Override
    public String toString() {
        return "SearchingFilter{" +
                "titlu='" + titlu + '\'' +
                ", gen='" + gen + '\'' +
                ", anAparitie=" + anAparitie +
                ", actori=" + actori +
                ", rating=" + rating +
                ", regizor='" + regizor + '\'' +
                '}';
    }
}
