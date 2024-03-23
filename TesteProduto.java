package view;

import model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setNome("Produto1");
		p1.setPreco(23.70f);
		p1.setQdtEstoque(7);
		
		System.out.println(p1.verificaProdutoDisponivel("Produto1"));
		System.out.println(p1.totalValorEstoque());
		
	}

}
