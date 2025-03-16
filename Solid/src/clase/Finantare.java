package clase;

public class Finantare {
    public static void finantareElev(Elev elev) {
        int s=30;
        System.out.println("Elevul " + elev.getNume() + " " + elev.getPrenume() + " primeste " + s + " Euro/zi in proiect.");
    }

    public static void finantareAngajat(Angajat angajat) {
        int s=10;
        System.out.println("Angajatul " + angajat.getNume() + " " + angajat.getPrenume() + " primeste " + s + " Euro/zi in proiect.");
    }

    public static void finantareStudent(Student student) {
        int s=20;
        System.out.println("Studentul " + student.getNume() + " " + student.getPrenume() + " primeste " + s + " Euro/zi in proiect.");
    }
}
