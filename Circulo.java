package model;

public class Circulo {

	public float raio;
	
	public Circulo(double raio) {
		this.raio = (float) raio;
	}
	
	public double getPerimetro() {
		double perimetro = 2 * 3.14 * raio;
		return perimetro;
	}
	public double getArea() {
		double area = 3.14 * Math.pow(raio, 2);
		return area;
	}
	
}
