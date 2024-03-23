package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(int dia, int mes, int ano) {
		dataNascimento = LocalDate.of(ano, mes, dia);
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, hoje);
		int idade = periodo.getYears();
		return idade;
	}

}
