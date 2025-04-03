import java.io.*;
import java.util.*;

public class Punctaje {
    private int[] punctaje = null;

    public void citestePunctaje(String numeFisier) {
        try (BufferedReader br = new BufferedReader(new FileReader(numeFisier))) {
            List<Integer> listaPunctaje = new ArrayList<>();
            String linie;
            while ((linie = br.readLine()) != null) {
                try {
                    int valoare = Integer.parseInt(linie.trim());
                    listaPunctaje.add(valoare);
                } catch (NumberFormatException e) {
                    System.out.println("(!) Valoare invalida in fisier: " + linie);
                }
            }
            if (listaPunctaje.isEmpty()) {
                throw new IllegalArgumentException("(!) Fisierul are punctaje invalide.");
            }
            punctaje = listaPunctaje.stream().mapToInt(i -> i).toArray();
        } catch (IOException e) {
            System.out.println("(!) Eroare: " + e.getMessage());
        }
    }

    public int getPozitie(int pct) {
        try {
            if (punctaje == null) {
                throw new NullPointerException("(!) Vectorul este null.");
            }
            if (punctaje.length == 0) {
                throw new IllegalArgumentException("(!) Vectorul este gol.");
            }

            Set<Integer> punctajeUnice = new TreeSet<>(Collections.reverseOrder());
            for (int p : punctaje) {
                if (p < 0) {
                    throw new IllegalArgumentException("(!) Vectorul contine valori negative.");
                }
                punctajeUnice.add(p);
            }

            List<Integer> listaOrdine = new ArrayList<>(punctajeUnice);

            int pozitie = listaOrdine.indexOf(pct);
            if (pozitie == -1) {
                throw new NoSuchElementException("(!) Punctajul nu se regaseste in lista.");
            }
            return pozitie + 1;
        } catch (Exception e) {
            System.out.println("(!) Eroare: " + e.getMessage());
            return -1;
        }
    }

    public void salveazaRezultate(String numeFisier) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(numeFisier))) {
            if (punctaje == null || punctaje.length == 0) {
                bw.write("(!) Vectorul de punctaje este null sau gol.\n");
                return;
            }

            Set<Integer> punctajeUnice = new TreeSet<>(Collections.reverseOrder());
            for (int p : punctaje) {
                if (p < 0) {
                    System.out.println("(!) Vectorul contine valori negative.\n");
                    return;
                }
                punctajeUnice.add(p);
            }

            List<Integer> listaOrdine = new ArrayList<>(punctajeUnice);

            for (int punct : punctajeUnice) {
                int pozitie = listaOrdine.indexOf(punct) + 1;
                bw.write("Punctaj: " + punct + " -> Pozitie: " + pozitie + "\n");
            }
        } catch (IOException e) {
            System.out.println("(!) Eroare: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Punctaje p = new Punctaje();
        String fin = "punctaje.txt";
        String fout = "rezultat.txt";

        p.citestePunctaje(fin);
        p.salveazaRezultate(fout);
    }
}
