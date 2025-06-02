package sortare.clase;

import java.util.ArrayList;

public class Sorter {
    private ISortare strategie;

    public void setStrategie(ISortare sortare) {
        this.strategie = sortare;
    }

    public void sortare(ArrayList<Integer> elemente) {
        if (this.strategie != null) {
            strategie.sorteaza(elemente);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
