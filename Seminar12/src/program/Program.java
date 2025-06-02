package program;

import clase.*;

public class Program {
	public static void main(String[] args) {
		Bancomat bancomat = Bancomat.getInstance();

		bancomat.alimentare(ValBancnota.B50, 2);
		bancomat.alimentare(ValBancnota.B20, 3);
		bancomat.alimentare(ValBancnota.B10, 5);

		Filtrare filtru50 = new Filtrare50();
		Filtrare filtru20 = new Filtrare20();
		Filtrare filtru10 = new Filtrare10();
		filtru50.setNextHandler(filtru20);
		filtru20.setNextHandler(filtru10);
		bancomat.setFiltrare(filtru50);

		try {
			bancomat.extragereSuma(130);
			System.out.println("Retragere reusita!");
			bancomat.afisareBancnote();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			bancomat.extragereSuma(75);
			System.out.println("Retragere reusita!");
		} catch (RuntimeException e) {
			System.out.println("Eroare: " + e.getMessage());
		}
	}
}