package sortare.clase;

import java.util.ArrayList;

public class Element {
    private ArrayList<Integer> elemente;

    public Element() {
        this.elemente = new ArrayList<>();
    }

    public void adaugaElement(int element) {
        this.elemente.add(element);
    }

    public ArrayList<Integer> getElemente() {
        return elemente;
    }

    @Override
    public String toString() {
        return "Element{" +
                "elemente=" + elemente +
                '}';
    }
}
