package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileReader {

	public static List<Student> readStudents(String file) throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter("\\s*,\\s*");
		List<Student> studenti = new ArrayList<>();

		while (input.hasNextLine()) {
			String line = input.nextLine().trim();
			String[] tokens = line.split("\\s*,\\s*");

			try {
				String nume = tokens[0];
				String prenume = tokens[1];
				int varsta = Integer.parseInt(tokens[2]);
				int punctaj = Integer.parseInt(tokens[3]);
				int nr = Integer.parseInt(tokens[4]);

				String[] vect = new String[nr];
				for (int i = 0; i < nr; i++) {
					vect[i] = tokens[5 + i];
				}

				int anStudiu = Integer.parseInt(tokens[5 + nr]);
				String facultate = tokens[6 + nr];

				Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, anStudiu);
				studenti.add(s);
			} catch (Exception e) {
				System.out.println("Eroare la citire: " + e.getMessage());
				e.printStackTrace();
			}
		}

		input.close();
		return studenti;
	}

	public static List<Angajat> readAngajati(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter("\\s*,\\s*");
		List<Angajat> angajati = new ArrayList<>();

		while (input2.hasNextLine()) {
			String line = input2.nextLine().trim();
			String[] tokens = line.split("\\s*,\\s*");

			try {
				String nume = tokens[0];
				String prenume = tokens[1];
				int varsta = Integer.parseInt(tokens[2]);
				int punctaj = Integer.parseInt(tokens[3]);
				int nr = Integer.parseInt(tokens[4]);

				String[] vect = new String[nr];
				for (int i = 0; i < nr; i++) {
					vect[i] = tokens[5 + i];
				}

				int salariu = Integer.parseInt(tokens[5 + nr]);
				String ocupatie = tokens[6 + nr];

				Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
				angajati.add(a);
			} catch (Exception e) {
				System.out.println("Eroare la citire: " + e.getMessage());
				e.printStackTrace();
			}
		}

		input2.close();
		return angajati;
	}

	public static List<Elev> readPupil(String file) throws FileNotFoundException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter("\\s*,\\s*");
		List<Elev> elevi = new ArrayList<>();

		while (input.hasNextLine()) {
			String line = input.nextLine().trim();
			String[] tokens = line.split("\\s*,\\s*");

			try {
				String nume = tokens[0];
				String prenume = tokens[1];
				int varsta = Integer.parseInt(tokens[2]);
				int punctaj = Integer.parseInt(tokens[3]);
				int nr = Integer.parseInt(tokens[4]);

				String[] vect = new String[nr];
				for (int i = 0; i < nr; i++) {
					vect[i] = tokens[5 + i];
				}

				int clasa = Integer.parseInt(tokens[5 + nr]);
				String tutore = tokens[6 + nr];

				Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
				elevi.add(e);
			} catch (Exception e) {
				System.out.println("Eroare la citire: " + e.getMessage());
				e.printStackTrace();
			}
		}

		input.close();
		return elevi;
	}

	public static void readAll() {
		List<Elev> listaElevi;
		List<Student> listaStudenti;
		List<Angajat> listaAngajati;

		try {
			System.out.println("----Outputurile din fisierele text----.");

			listaElevi = FileReader.readPupil("Solid/elevi.txt");

			for (int i = 0; i < listaElevi.size(); i++)
				System.out.println(listaElevi.get(i).toString());

			listaStudenti = FileReader.readStudents("studenti.txt");
			for (int i = 0; i < listaStudenti.size(); i++)
				System.out.println(listaStudenti.get(i).toString());

			listaAngajati = FileReader.readAngajati("angajati.txt");
			for (int i = 0; i < listaAngajati.size(); i++)
				System.out.println(listaAngajati.get(i).toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<ProiectInternational> readProjects(String file) throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter("\\s*,\\s*");
		List<ProiectInternational> proiecte = new ArrayList<>();

		while (input.hasNextLine()) {
			String line = input.nextLine().trim();
			String[] tokens = line.split("\\s*,\\s*");

			try {
				String nume = tokens[0].trim();
				String tara = tokens[1];
				String tip = tokens[2];


				ProiectInternational p = new ProiectInternational(nume, tara, tip);
				proiecte.add(p);
			} catch (Exception e) {
				System.out.println("Eroare la citire: " + e.getMessage());
				e.printStackTrace();
			}
		}

		input.close();
		return proiecte;
	}

}
