package angajare.program;

import angajare.clase.DepartamentIT;
import angajare.clase.ProcesAngajare;

public class Main {
    public static void main(String[] args) {
        ProcesAngajare proces = new DepartamentIT();
        System.out.println("======Departament IT======");
        proces.deruleazaProces();

        System.out.println("\n======Departament Vanzari======");
        proces.deruleazaProces();
    }
}
