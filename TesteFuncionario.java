package view;

import model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Func1");
		f1.setCargo("Cargo1");
		f1.setSalario(1300);
		
		double salarioLiquido = f1.getSalarioLiquido(220, 350);
		System.out.println(f1.getNome());
		System.out.println(f1.getCargo());
		System.out.println(f1.getSalario());
		System.out.println("Salario Líquido: " + salarioLiquido);
		
	}

}
