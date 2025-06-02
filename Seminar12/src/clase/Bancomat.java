package clase;

import java.util.HashMap;
import java.util.Map;

public class Bancomat implements IBancomat {
	private static Map<ValBancnota, Integer> cantitate;
	private static Bancomat instance = new Bancomat();
	private Filtrare filtrare;

	private Bancomat() {
		cantitate = new HashMap<>();
	}

	public static Bancomat getInstance() {
		return instance;
	}

	public void setFiltrare(Filtrare filtrare) {
		this.filtrare = filtrare;
	}

	public void extragereSuma(int suma) {
		if (suma <= 0) {
			throw new RuntimeException("Suma trebuie sa fie pozitiva.");
		}

		Map<ValBancnota, Integer> bancnoteDeExtras = new HashMap<>();
		boolean success = filtrare.proceseaza(suma, bancnoteDeExtras);

		if (!success) {
			throw new RuntimeException("Suma nu poate fi formata din bancnote disponibile.");
		}

		for (Map.Entry<ValBancnota, Integer> entry : bancnoteDeExtras.entrySet()) {
			ValBancnota vb = entry.getKey();
			int needed = entry.getValue();
			if (getNrBancnote(vb) < needed) {
				throw new RuntimeException("Nu sunt suficiente bancnote de " + vb);
			}
		}

		for (Map.Entry<ValBancnota, Integer> entry : bancnoteDeExtras.entrySet()) {
			extragere(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public int getNrBancnote(ValBancnota valoareBancnota) {
		return cantitate.getOrDefault(valoareBancnota, 0);
	}

	public void alimentare(ValBancnota valoareBancnota, int nrBancnote) {
		if(nrBancnote>0) {
			if(cantitate.containsKey(valoareBancnota)) {
				cantitate.replace(valoareBancnota, cantitate.get(valoareBancnota)+nrBancnote);
			} else {
				cantitate.put(valoareBancnota, nrBancnote);
			}
		}
	}

	public void extragere(ValBancnota valoareBancnota, int nrBancnote) {
		if(nrBancnote>0) {
			if(cantitate.containsKey(valoareBancnota)) {
				if(cantitate.get(valoareBancnota)>=nrBancnote)
					cantitate.replace(valoareBancnota, cantitate.get(valoareBancnota)-nrBancnote);
			}
		}
	}

	public void afisareBancnote() {
		for(ValBancnota valoare: cantitate.keySet()) {
			System.out.println("Valoare: "+valoare + " cantitate: "+cantitate.get(valoare));
		}
	}
}