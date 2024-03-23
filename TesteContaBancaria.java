package view;

import model.ContaBancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		
		double saldo = c1.realizaDeposito(200);
		System.out.println("Saldo após deposico: " + saldo);
		
		saldo = c1.realizaSaque(60);
		System.out.println("Saldo após saque: " + saldo);
	}

}
