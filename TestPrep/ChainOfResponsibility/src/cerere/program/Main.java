package cerere.program;

import cerere.clase.*;

public class Main {
    public static void main(String[] args) {
        BaseCerereHandler angajatHandler = new AngajatHandler();
        BaseCerereHandler managerHandler = new ManagerHandler();
        BaseCerereHandler directorHandler = new DirectorHandler();

        Cerere cerere = new Cerere("IT equipment acquisition", 800);
        Cerere cerere2 = new Cerere("Team building", 3500);
        Cerere cerere3 = new Cerere("Office makeover", 15000);

        Office office = new Office(angajatHandler, managerHandler, directorHandler);
        office.startProccess(cerere);
        office.startProccess(cerere2);
        office.startProccess(cerere3);
    }
}
