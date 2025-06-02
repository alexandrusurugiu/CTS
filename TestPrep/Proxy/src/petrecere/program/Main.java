package petrecere.program;

import petrecere.clase.IPetrecere;
import petrecere.clase.Participant;
import petrecere.clase.Petrecere;
import petrecere.clase.PetrecereProxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaInvitati = new ArrayList<>();
        listaInvitati.add("Mos Craciun");
        listaInvitati.add("Rudolf");

        Participant p1 = new Participant("Gigel", 20);
        Participant p2 = new Participant("Costel", 12);
        Petrecere petrecere = new Petrecere("24.12.2022", listaInvitati);
        petrecere.adaugaParticipant(p1);
        petrecere.adaugaParticipant(p2);
        System.out.println(petrecere);

        Participant p3 = new Participant("Marcel", 20);
        Participant p4 = new Participant("Ionela", 12);
        IPetrecere petrecereProxy = new PetrecereProxy(petrecere);
        petrecereProxy.adaugaParticipant(p4);
    }
}