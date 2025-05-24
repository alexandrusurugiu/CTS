package petrecere.clase;

public class PetrecereProxy implements IPetrecere {
    private Petrecere petrecere;

    public PetrecereProxy(Petrecere petrecere) {
        super();
        this.petrecere = petrecere;
    }

    @Override
    public void adaugaParticipant(Participant cl) {
        if (cl.getVarsta() < 18) {
            System.out.println("Clientul " + cl.getNume() + " nu are varsta de 18 ani pentru a putea intra la petrecere.");
        } else {
            petrecere.adaugaParticipant(cl);
        }
    }

    @Override
    public void afisareProgram() {
        this.petrecere.afisareProgram();
    }
}
