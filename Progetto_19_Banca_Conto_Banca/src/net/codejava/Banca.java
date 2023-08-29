package net.codejava;

import java.util.ArrayList;

public class Banca {
	// Attributi
	private String nome;
	private ArrayList<Conto_Bancario> conti;

	public Banca(String nome) {
		this.nome = nome;
		conti = new ArrayList<>(); // Creo un nuovo ArrayList vuoto
	}

	public String getNome() {
		return nome;
	}

	public void aggiungiConto(Conto_Bancario conto) {
		conti.add(conto); // Aggiungo un conto bancario all'ArrayList dei conti
	}

	public void rimuoviConto(int numeroConto) {
		Conto_Bancario contoDaRimuovere = null;

		// Cerco il conto bancario con il numero specificato all'interno dell'ArrayList
		// dei conti
		for (Conto_Bancario conto : conti) {
			if (conto.getNumeroConto() == numeroConto) {
				contoDaRimuovere = conto; // Memorizza il conto da rimuovere
				break;
			}
		}

		if (contoDaRimuovere != null) {
			conti.remove(contoDaRimuovere); // Rimuovo il conto bancario dall'ArrayList dei conti
			System.out.println("Conto bancario rimosso.");
		} else {
			System.out.println("Nessun conto bancario con il numero specificato.");
		}
	}

	public Conto_Bancario cercaConto(int numeroConto) {
		// Cerco il conto bancario con il numero specificato all'interno dell'ArrayList
		// dei conti
		for (Conto_Bancario conto : conti) {
			if (conto.getNumeroConto() == numeroConto) {
				return conto; // Restituisce il conto trovato
			}
		}

		return null; // Se non viene trovato alcun conto con il numero specificato, restituisce null
	}

	public void deposita(int numeroConto, double importo) {
		Conto_Bancario conto = cercaConto(numeroConto);
		if (conto != null) {
			conto.deposita(importo);
			System.out.println("Importo depositato con successo.");
		} else {
			System.out.println("Nessun conto bancario con il numero specificato.");
		}
	}

	public void preleva(int numeroConto, double importo) {
		Conto_Bancario conto = cercaConto(numeroConto);
		if (conto != null) {
			conto.preleva(importo);
			System.out.println("Importo prelevato con successo.");
		} else {
			System.out.println("Nessun conto bancario con il numero specificato.");
		}
	}

	public void trasferisci(int numeroConto1, int numeroConto2, double importo) {
		Conto_Bancario conto1 = cercaConto(numeroConto1);
		Conto_Bancario conto2 = cercaConto(numeroConto2);

		if (conto1 != null && conto2 != null) {
			if (conto1.getSaldo() >= importo) {
				conto1.preleva(importo);
				conto2.deposita(importo);
				System.out.println("Trasferimento effettuato con successo.");
			} else {
				System.out.println("Saldo insufficiente sul conto di origine.");
			}
		} else {
			System.out.println("Uno o entrambi i conti specificati non esistono.");
		}
	}

	public Conto_Bancario[] getConti() {
		return null;
	}
}
