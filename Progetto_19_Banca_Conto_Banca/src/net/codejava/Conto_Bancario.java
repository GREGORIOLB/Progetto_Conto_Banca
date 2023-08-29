package net.codejava;

public class Conto_Bancario {
	private int numeroConto;
	private double saldo;

	public Conto_Bancario(int numeroConto, double saldo) {
		this.numeroConto = numeroConto;
		this.saldo = saldo;
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	public double getSaldo() {
		return saldo;
	}

	// metodo per depositare soldi
	public void deposita(double importo) {
		saldo += importo;
	}

	// metodo per prelevare soldi
	public void preleva(double importo) {
		if (importo <= saldo) {
			saldo -= importo;
		} else {
			System.out.println("Attenzione il saldo e insufficiente");
		}
	}

}
