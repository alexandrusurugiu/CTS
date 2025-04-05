package test;

import clase.Masina;
import clase.PrototypeFactory;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeFactory factory = PrototypeFactory.getInstance();
        PrototypeFactory factory2 = PrototypeFactory.getInstance();

        if (factory == factory2) {
            System.out.println("e singleton");
        }

        Masina masina = new Masina("Seat", 2010);
        Masina masina2 = new Masina("Renault", 2010);
        Masina masina3 = new Masina("Dacia", 2010);
        Masina masina4 = new Masina("Dacia", 2010);

        factory.createSticker(masina);
        factory.createSticker(masina2);
        factory.createSticker(masina3);
        factory.createSticker(masina4);
    }
}