package joc.program;

import joc.clase.Joc;
import joc.clase.JocRPG;

public class Main {
    public static void main(String[] args) {
        Joc joc = new JocRPG();
        System.out.println("======Joc RPG======");
        joc.initializeazaJoc();

        System.out.println("\n======Joc Shooter======");
        joc.initializeazaJoc();
    }
}
