package program;

import clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidat> candidati = new ArrayList<>();

        candidati.add(new Candidat("Ion Popescu", 8.5f, 9.0f, "Eseu despre viata"));
        candidati.add(new Candidat("Maria Ionescu", 4.5f, 8.0f, "Eseu despre natura"));
        candidati.add(new Candidat("Andrei Georgescu", 6.5f, 7.0f, "Eseu despre tehnologie"));
        candidati.add(new Candidat("Elena Vasilescu", 9.5f, 10.0f, "Eseu despre arta"));

        // Aplicam filtrarea
        Filtrare filtrareEseu = new FiltrareEseu();
        Filtrare filtrareMedieBAC = new FiltrareMedieBAC();
        Filtrare filtrareMedieExamen = new FiltrareMedieExamen();
//
//        filtrareEseu.setNextHandler(filtrareMedieBAC);
//        filtrareMedieBAC.setNextHandler(filtrareMedieExamen);
//
//        List<Candidat> listaFinala = new ArrayList<>();
//        listaFinala = filtrareEseu.filter(candidati);
//
//        System.out.println(listaFinala);

        System.out.println("----------Folosim Facade----------");
        Admitere admitere = new Admitere(filtrareEseu, filtrareMedieBAC, filtrareMedieExamen);
        admitere.addCandidat(new Candidat("Ion Popescu", 8.5f, 9.0f, "Eseu despre viata"));
        admitere.addCandidat(new Candidat("Maria Ionescu", 4.5f, 8.0f, "Eseu despre natura"));
        admitere.addCandidat(new Candidat("Andrei Georgescu", 6.5f, 7.0f, "Eseu despre tehnologie"));
        admitere.addCandidat(new Candidat("Elena Vasilescu", 9.5f, 10.0f, "Eseu despre arta"));
        admitere.startAdmitere();

        //Tema pentru saptamana viitoare
        //1. Modificare pe listrare (fara return, practic sa modificam direct lista)
        //2. Exemplul cu Banca (metoda abstracta intoarce bool)
        //3. Exemplul Load Page
    }
}
