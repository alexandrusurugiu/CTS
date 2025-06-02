package sortare.program;

import sortare.clase.Element;
import sortare.clase.Sorter;
import sortare.clase.StrategieCrescatoare;
import sortare.clase.StrategieDescrescatoare;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Element elemente = new Element();
        elemente.adaugaElement(1);
        elemente.adaugaElement(124);
        elemente.adaugaElement(34);
        elemente.adaugaElement(56);
        elemente.adaugaElement(5);
        elemente.adaugaElement(6231);
        elemente.adaugaElement(76);
        elemente.adaugaElement(81);

        ArrayList<Integer> elemente2 = elemente.getElemente();

        Sorter sorter = new Sorter();

        sorter.setStrategie(new StrategieCrescatoare());
        System.out.println("Elementele sortate crescator: \n");
        sorter.sortare(elemente2);
        elemente2.forEach(System.out::println);

        sorter.setStrategie(new StrategieDescrescatoare());
        System.out.println("\nElementele sortate descrescator: \n");
        sorter.sortare(elemente2);
        elemente2.forEach(System.out::println);
    }
}
