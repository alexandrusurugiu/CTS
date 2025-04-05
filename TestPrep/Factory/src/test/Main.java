package test;

import clase.AtacantFactory;
import clase.FundasFactory;
import clase.IFactory;
import clase.Jucator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        IFactory factory = new AtacantFactory();
        Jucator j1 = factory.creeazaJucator();
        Jucator j2 = factory.creeazaJucator();

        factory = new FundasFactory();
        Jucator j3 = factory.creeazaJucator();

        j1.setName("Hagi");
        j2.setVarsta(10);
        j1.addMedicament("Ibuprofen");
        j3.addMedicament("Boala vacii");

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
    }
}