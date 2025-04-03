package testing;

import clase.*;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	private static List<Angajat> angajati;
    private static List<Elev> elevi;
    private static List<Student> studenti;
    private static List<ProiectInternational> proiecte;

	public static void main(String[] args) {
        try {
            System.out.println("\n<===========Date===========>");
            System.out.println("\n------Angajati------\n");
            angajati = FileReader.readAngajati("Solid/angajati.txt");
			angajati.stream().forEach(angajat -> System.out.println(angajat));
            System.out.println("\n------Elevi------\n");
			elevi = FileReader.readPupil("Solid/elevi.txt");
			elevi.stream().forEach(elev -> System.out.println(elev));
            System.out.println("\n------Studenti------\n");
            studenti = FileReader.readStudents("Solid/studenti.txt");
            studenti.stream().forEach(student -> System.out.println(student));
            System.out.println("\n------Proiecte------\n");
            proiecte = FileReader.readProjects("Solid/proiecte.txt");
            proiecte.stream().forEach(proiectInternational -> System.out.println(proiectInternational));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n");
        System.out.println("\n<===========Finantari===========>");
        System.out.println("\n------Angajati------\n");
        angajati.forEach(Finantare::finantareAngajat);
        System.out.println("\n------Elevi------\n");
        elevi.forEach(Finantare::finantareElev);
        System.out.println("\n------Studenti------\n");
        studenti.forEach(Finantare::finantareStudent);
    }

}
