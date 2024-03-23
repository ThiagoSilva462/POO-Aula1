package view;

import model.Circulo;

public class TesteCirculo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(5);
		double area = c1.getArea();
		double perimetro = c1.getPerimetro();
		
		System.out.println("Area do Círculo: " + area);
		System.out.println("Perímetro do Círculo: " + perimetro);
	}

}