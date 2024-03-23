package view;

import model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Pessoa1");
		p1.setDataNascimento(19, 4, 1791);
		p1.setProfissao("Profissao1");
		
		System.out.println(p1.getNome());
		System.out.println(p1.getDataNascimento());
		System.out.println(p1.getProfissao());
		if (p1.getIdade() < 150) {
			System.out.println(p1.getIdade());
		} else {
			System.out.println("Falecido");
		}
	}

}
