package net.codejava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Creazione della banca
		System.out.print("Inserisci il nome della banca: ");
		String nomeBanca = input.nextLine();
		Banca banca = new Banca(nomeBanca);

		// Creazione di alcuni conti bancari
		Conto_Bancario conto1 = new Conto_Bancario(1, 1000000);
		Conto_Bancario conto2 = new Conto_Bancario(2, 2000000);
		Conto_Bancario conto3 = new Conto_Bancario(3, 3000000);

		// Aggiunta dei conti bancari alla banca
		banca.aggiungiConto(conto1);
		banca.aggiungiConto(conto2);
		banca.aggiungiConto(conto3);

		// Operazioni di deposito, prelievo e trasferimento
		System.out.print("Inserisci il numero del conto di origine: ");
		int numeroContoOrigine = input.nextInt();
		System.out.print("Inserisci il numero del conto di destinazione: ");
		int numeroContoDestinazione = input.nextInt();
		System.out.print("Inserisci l'importo da trasferire: ");
		double importoTrasferimento = input.nextDouble();

		banca.trasferisci(numeroContoOrigine, numeroContoDestinazione, importoTrasferimento);

		// Stampa del saldo di tutti i conti bancari nella banca
		System.out.println("Saldo dei conti bancari nella banca " + banca.getNome() + ":");
		for (Conto_Bancario conto : banca.getConti()) {
			System.out.println("Numero conto: " + conto.getNumeroConto() + ", Saldo: " + conto.getSaldo());
		}
	}

}
