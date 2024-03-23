package model;

public class ContaBancaria {

	public int numeroConta;
	public String nome;
	public double saldo;
	
	public ContaBancaria(){
		numeroConta = 100;
		nome = "Sem Nome";
		saldo = 0;
	}
	
	public double realizaDeposito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	public double realizaSaque(double valor) {
		saldo = saldo - valor;
		return saldo;
	}
}
