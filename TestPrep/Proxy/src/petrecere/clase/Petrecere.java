package petrecere.clase;

import java.util.ArrayList;
import java.util.List;

public class Petrecere implements IPetrecere {
    private String data;
    private List<String> listaInvitati;
    private List<Participant> listaParticipanti;

    public Petrecere(String data, List<String> listaInvitati) {
        super();
        this.data = data;
        this.listaInvitati = listaInvitati;
        this.listaParticipanti = new ArrayList<>();
    }

    @Override
    public void adaugaParticipant(Participant cl) {
        this.listaParticipanti.add(cl);
    }

    @Override
    public void afisareProgram() {
        System.out.println("afisareProgram");
    }

    @Override
    public String toString() {
        return "Petrecere{" +
                "data='" + data + '\'' +
                ", listaInvitati=" + listaInvitati +
                ", listaParticipanti=" + listaParticipanti +
                '}';
    }
}
